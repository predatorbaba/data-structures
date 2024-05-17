package strings;

public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "ABCBA";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        boolean result = true;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return result;
    }

}
