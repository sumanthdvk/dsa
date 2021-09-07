public class RearrangePositiveNegativeNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, 5, 6, 7, -8, 9};
        reArrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reArrange(int[] arr) {

        int pos = -1, neg = arr.length;

        while(true) {
            neg = nextNegative(arr, neg-1);
            pos = nextPositive(arr, pos+1);

            if (neg < pos) break;

            if (pos != -1 && neg != 1) {
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
            }
        }

    }

    private static int nextNegative(int[] arr, int index) {
        while(index >= 0) {
            if (arr[index] < 0) return index;
            index--;
        }
        return -1;
    }

    private static int nextPositive(int[] arr, int index) {
        while(index < arr.length) {
            if (arr[index] > 0) return index;
            index++;
        }

        return -1;
    }
}
