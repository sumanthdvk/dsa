public class MountainArray {
    public static void main(String[] args) {

        for (int i = 1; i < 2; i++) {
            System.out.println("inside");
        }

        if (validMountainArray(new int[]{0, 3, 2, 1})) {
            System.out.println("Correct");
        } else System.out.println("Incorrect solution");
    }
    public static boolean validMountainArray(int[] arr) {

        int N = arr.length;
        if (N < 3) return false;

        boolean upward = true;
        int i;
        for(i = 0; i < N - 1; i++) {
            if( upward ) {
                if (arr[i] > arr[i + 1]) {
                    if (i == 0) {
                        return false;
                    }
                    upward = false;
                }
            } else {
                if (arr[i] > arr[i + 1]) continue;
                else return false;
            }
        }
        if (upward) return false;
        return true;
    }
}
