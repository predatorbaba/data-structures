package strings;

import java.util.HashMap;

public class IsomorphicString {

    public static void main(String[] args) {
        String str1 = "badc";
        String str2 = "kikp";
        boolean result = isIsomorphic(str1, str2);
        System.out.println(result);
    }

    public static boolean isIsomorphic(String str1, String str2) {
        if(str1.length() != str2.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++) {
            char original = str1.charAt(i);
            char replacement = str2.charAt(i);
            if(!map.containsKey(original)) {
                if(!map.containsValue(replacement)) map.put(original, replacement);
                else return false;
            } else {
                char mappedChar = map.get(original);
                if(mappedChar != replacement) return false;
            }
        }
        return true;
    }

}
