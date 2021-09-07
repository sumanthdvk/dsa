public class MoveZeroesToLeft {
    public static void main(String[] args) {
        int[] A = new int[]{1, 10, -1, 11, 5, 0, -7, 0, 25, -35};
        moveZeros(A);

        for (int x: A) {
            System.out.println(x);
        }

    }

    static void moveZeros(int[] A) {
        int len = A.length;
        int[] temp = new int[len];
        int tempIndex = 0;

        for (int value : A) {
            if (value != 0) {
                temp[tempIndex++] = value;
            }
        }

        int zeroLen = len - tempIndex;

        int i = 0;
        while (i < zeroLen) {
            A[i++] = 0;
        }

        int j = 0;
        while (j < tempIndex) {
            A[i++] = temp[j++];
        }

    }
}
