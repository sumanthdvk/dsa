public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 9};

        betweenSmallestAndLargest(arr);
        System.out.println();
        untilLargestFromOne(arr);

    }

    private static void untilLargestFromOne(int[] arr) {
        int length = arr.length;
        int start = 1;

        int index = 0;
        while (index != length) {
            if (arr[index] != start)
                System.out.print(start);
            else
                index++;
            start++;

        }
    }

    private static void betweenSmallestAndLargest(int[] arr) {
        int length = arr.length;
        int start = arr[0];

        int index = 1;
        while (index != length) {
            if (arr[index] != ++start)
                System.out.print(start);
            else
                index++;

        }
    }
}
