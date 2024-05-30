package arrays;

public class FindPeakElement {

    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        System.out.println(findPeakElementSmallerThanItsNeighbours(arr));
    }
    public static int findPeakElementSmallerThanItsNeighbours(int[] arr) {
        int size = arr.length;
        if(size == 1) return arr[0];
        if(arr[0] >= arr[1]) return arr[0];
        if(arr[size - 1] >= arr[size - 2]) return size - 1;
        for(int i=1; i<size-1; i++) {
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) return arr[i];
        }
        return 0;
    }

}
