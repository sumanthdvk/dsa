public class ProductArrayExceptIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == counter) continue;
            int product = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == counter || i == j) continue;
                product += arr[i] * arr[j];
            }
            result[i] = product; counter++;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
