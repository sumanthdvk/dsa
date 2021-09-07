import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonPrefixLength {
    public static void main(String[] args) {
        List<Integer> result = commonPrefix(Arrays.asList("ababaa", "abcabcd"));
        result.forEach(System.out::println);
    }

    public static List<Integer> commonPrefix(List<String> inputs) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Cores: " + cores);
        for (String input : inputs) {
            int length = input.length();
            for (int i = 1; i < input.length(); i++) {
                //String prefix = input.substring(0, i);
                String suffix = input.substring(i);

                if (input.startsWith(suffix)) {
                    length += suffix.length();
                } else {
                    for (int j = suffix.length() - 1; j >= 0; j--) {
                        String prefSubStr = suffix.substring(0, j);
                        if (input.startsWith(prefSubStr)) {
                            length += prefSubStr.length();
                            break;
                        }
                    }
                }
            }
            result.add(length);

        }
        return result;
    }
}
