import java.util.HashMap;
import java.util.Map;

public class CheckSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 8, 21, 39};
        int n = 27;
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            int diff = n - arr[i];
            if (map.containsKey(diff)) {
                result[0] = arr[i]; result[1] = diff;
            }
            map.put(arr[i], i);

        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}
