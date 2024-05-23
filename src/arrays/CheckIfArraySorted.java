package arrays;

public class CheckIfArraySorted {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        boolean isSorted = checkIfArraySorted(arr);
        System.out.println(isSorted);
    }

    public static boolean checkIfArraySorted(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }

}
