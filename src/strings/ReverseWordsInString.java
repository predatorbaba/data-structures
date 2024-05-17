package strings;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String str = "Hello Strings, Learn More and Grow";
        char[] charArr = str.toCharArray();
        String revStr1 = reverseWordsInStringGeneralApproach(str);
        reverseWordsInStringOptimizedApproach(charArr);
        System.out.println(revStr1);
        System.out.println(charArr);
    }

    public static String reverseWordsInStringGeneralApproach(String str) {
        String revStr = "";
        String[] strArr = str.split(" ");
        for(int i=strArr.length-1; i>=0; i--) {
            revStr += strArr[i]+" ";
        }
        return revStr.trim();
    }

    public static void reverseWordsInStringOptimizedApproach(char[] charArr) {
        int start = 0;
        for(int end = 0; end < charArr.length; end++) {
            if(charArr[end] == ' ') {
                reverse(charArr, start, end-1);
                start = end+1;
            }
        }
        reverse(charArr, start, charArr.length - 1);
        reverse(charArr, 0, charArr.length - 1);
    }

    private static void reverse(char[] charArr, int low, int high) {
        while(low <= high) {
            char temp = charArr[low];
            charArr[low] = charArr[high];
            charArr[high] = temp;
            low++;
            high--;
        }
    }

}
