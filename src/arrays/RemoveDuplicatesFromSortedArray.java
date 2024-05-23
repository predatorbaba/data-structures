package arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int index = removeDuplicates(arr);
        for(int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int removeDuplicates(int[] arr) {
        if(arr.length == 0 || arr.length == 1) {
            System.out.println(arr[0]);
        }
        int j = 0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        return j;
    }

}
