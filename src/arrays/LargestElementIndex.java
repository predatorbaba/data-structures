package arrays;

public class LargestElementIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,6,4,5};
        findLargestElementIndex(arr);
    }

    public static void findLargestElementIndex(int[] arr) {
        int largestIndex = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[largestIndex]) {
                largestIndex = i;
            }
        }
        System.out.println(largestIndex);
    }

}
