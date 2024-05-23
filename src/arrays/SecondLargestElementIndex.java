package arrays;

public class SecondLargestElementIndex {

    public static void main(String[] args) {
        int[] arr = {1,7,3,4,5};
        findSecondLargestElementIndex(arr);
    }

    public static void findSecondLargestElementIndex(int[] arr) {
        int largest = 0;
        int secondLargest = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] > arr[secondLargest] && arr[largest] > arr[secondLargest]) {
                secondLargest = i;
            }
        }
        System.out.println(secondLargest);
    }

}
