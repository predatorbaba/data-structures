package strings;

import java.util.Arrays;

public class LeftmostNonRepeatingRepeatingCharacter {

    public static void main(String[] args) {
        String str = "abbbcdb";
        int index = findLeftmostNonRepeatingCharacterIndex(str);
        System.out.println(index);
    }

    public static int findLeftmostNonRepeatingCharacterIndex(String str) {
        int CHAR = 256;
        int[] chars = new int[CHAR];
        Arrays.fill(chars, -1);
        for(int i=0; i<str.length(); i++) {
            if(chars[str.charAt(i)] == -1) {
                chars[str.charAt(i)] = i;
            } else {
                chars[str.charAt(i)] = -2;
            }
        }
         int index = Integer.MAX_VALUE;
        for(int i=0; i<CHAR; i++) {
            if(chars[i] >= 0) {
                index = Math.min(index, chars[i]);
            }
        }
        return (index == Integer.MAX_VALUE) ? -1 : index;
    }

}
