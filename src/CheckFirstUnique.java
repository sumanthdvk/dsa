public class CheckFirstUnique {
    public static void main(String[] args) {
        int[] arr = {4, 4, 4, 3};
        System.out.println(findFirstUnique(arr));
    }
    private static int findFirstUnique(int[] arr)
    {
        int result = 0;
        boolean duplicate = false;
        // write your code here
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    duplicate = true;
                }
            }
            if (!duplicate)
                return arr[i];
            duplicate = false;
        }
        return -1;
    }
}
