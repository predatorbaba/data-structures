package arrays;

public class FindMajority {

    public static void main(String[] args) {
        int[] arr = {5,22,29,12,32,69,1,75};
        int a = 29;
        int b = 96;
        System.out.println(findMajority(arr, a, b));
    }

    public static int findMajority(int[] arr, int element1, int element2) {
        int counterEle1 = 0;
        int counterEle2 = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == element1) counterEle1++;
            else if(arr[i] == element2) counterEle2++;
        }
        if(counterEle1 == 0 && counterEle2 == 0) return Math.min(element1, element2);
        else if(counterEle1 == counterEle2) return element1;
        else if(counterEle1 > 0 || counterEle2 > 0) return Math.min(element1, element2);
        return Math.max(element1, element2);
    }

}
