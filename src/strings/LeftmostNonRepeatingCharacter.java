package strings;

import java.util.Arrays;

public class LeftmostNonRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abbbcdb";
//        int index = findLeftmostNonRepeatingCharacterIndex(str);
        char result = nonrepeatingCharacter(str);
        System.out.println(result);
    }

//    public static int findLeftmostNonRepeatingCharacterIndex(String str) {
//        int CHAR = 256;
//        int[] chars = new int[CHAR];
//        Arrays.fill(chars, -1);
//        for(int i=0; i<str.length(); i++) {
//            if(chars[str.charAt(i)] == -1) {
//                chars[str.charAt(i)] = i;
//            } else {
//                chars[str.charAt(i)] = -2;
//            }
//        }
//         int index = Integer.MAX_VALUE;
//        for(int i=0; i<CHAR; i++) {
//            if(chars[i] >= 0) {
//                index = Math.min(index, chars[i]);
//            }
//        }
//        return (index == Integer.MAX_VALUE) ? -1 : index;
//    }

    static char nonrepeatingCharacter(String S)
    {
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        Arrays.fill(charArr, -1);
        for(int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);
            if(charArr[ch] == -1) charArr[ch] = i;
            else charArr[ch] = -2;
        }
        int INDEX = Integer.MAX_VALUE;
        char result = '$';
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] >= 0) {
                INDEX = Math.min(INDEX, charArr[i]);
                System.out.println(INDEX);
                result = (char) INDEX;
            }
        }
        return result;
    }

}
