public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6};
        int[] arr2 = {2,4,7,8};
        int size = arr1.length + arr2.length;
        int[] sorted = new int[size];
        int arr1_index = 0, arr2_index =0, index = 0;

        while (index < size) {
            if(arr1_index < arr1.length && arr1[arr1_index] < arr2[arr2_index]) {
                sorted[index] = arr1[arr1_index];
                arr1_index++;
            } else if (arr2_index < arr2.length){
                sorted[index] = arr2[arr2_index];
                arr2_index++;
            }
            index++;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(sorted[i]);
        }
    }
}
