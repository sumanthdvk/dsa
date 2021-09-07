import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class FrequencySort {
    private static int index = 0;

    public static void main(String[] args) {
        //Sort by frequency in descending order and in case of same frequency go with ascending order
        //input 3, 5, 3, 5, 1, 5, 1, 2
        //output 5, 5, 5, 1, 1, 3, 3, 2

        int[] nums = {3, 5, 3, 5, 1, 5, 1, 2};

        int[] result = sortByFrequency(nums);
        for (int n : result) {
            System.out.print(n);
        }
    }

    private static int[] sortByFrequency(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];

        TreeMap<Integer, Integer> numFreq = new TreeMap<>();
        for (int num : nums) {
            numFreq.put(num, numFreq.getOrDefault(num, 0) + 1);
        }
        //numFreq.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));

        TreeMap<Integer, ArrayList> freqNums = new TreeMap<>(Collections.reverseOrder());

        numFreq.forEach((num, freq) -> {
            freqNums.computeIfAbsent(freq, k -> new ArrayList<Integer>());
            freqNums.get(freq).add(num);
        });


        freqNums.forEach((freq, numList) -> {
            numList.forEach(num -> {
                for (int i = 0; i < freq; i++) {
                    result[index++] = (int) num;
                }
            });
        });

        return result;
    }
}
