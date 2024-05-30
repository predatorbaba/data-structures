package arrays;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayInGroups {

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> arr = new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseArrayInGroups(arr, 3);
    }

    public static void reverseArrayInGroups(ArrayList<Integer> arr, int k) {
        for(int i=0; i<arr.size(); i+=k) {
            int left = i;
            int right = Math.min(i+k-1, arr.size() - 1);
            while(left < right) {
                int temp = arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right, temp);
                left++;
                right--;
            }
        }
        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i)+",");
        }
    }

}
