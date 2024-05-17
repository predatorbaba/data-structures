package strings;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        System.out.println(checkAnagram(str1, str2));
    }

    public static boolean checkAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        Arrays.fill(charArr, 0);
        for(int i=0; i<str1.length(); i++) {
            charArr[str1.charAt(i)]++;
            charArr[str2.charAt(i)]--;
        }
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
