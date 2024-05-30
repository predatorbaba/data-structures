package arrays;

public class MaximumIndexDifference {

    public static void main(String[] args) {
        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        System.out.println(findMaxDifference(arr));
    }

    public static int findMaxDifference(int[] arr) {
        int maxDiff = -1;
        int size = arr.length;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                if(arr[i] < arr[j] && (j-i) > maxDiff) {
                    maxDiff = j-1;
                }
            }
        }
        return maxDiff;
    }

}
