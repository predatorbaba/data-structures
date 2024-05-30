package arrays;

import java.util.HashMap;
import java.util.Map;

public class MaxSubArraySumDistinct {

    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
//        int[] arr = {1,2,2};
        int k = 3;
        System.out.println(slidingWindow(arr, k));
    }

    public static int slidingWindow(int[] arr, int k) {
        int size = arr.length;
        Map<Integer, Integer> map = new HashMap<>(k);
        int sum = 0;
        for(int i=0; i<k; i++) {
            map.merge(arr[i], 1, Integer::sum);
            sum += arr[i];
        }
        int ans = map.size() == k ? sum : 0;
        for(int i=k; i<size; i++) {
            map.merge(arr[i], 1, Integer::sum);
            if (map.merge(arr[i - k], -1, Integer::sum) == 0) {
                map.remove(arr[i - k]);
            }
            sum += arr[i] - arr[i - k];
            if (map.size() == k) {
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }

}
