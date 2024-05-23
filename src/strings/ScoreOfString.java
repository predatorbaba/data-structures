package strings;

import java.util.*;

public class ScoreOfString {

    public static void main(String[] args) {
        String str = "zaz";
        int score = findScoreOfString(str);
        System.out.println(score);
    }

    public static int findScoreOfString(String str) {
        int score = 0;
        int size = str.length();
        Map<Character,Integer> charIndexMap = new HashMap<>();
        for(int i=0; i<size; i++) {
            int index = str.charAt(i);
            if(!charIndexMap.containsKey(str.charAt(i))) {
                charIndexMap.put(str.charAt(i), index);   
            }
        }
        for(int i=0; i<str.length()-1; i++) {
            char firstKey = str.charAt(i);
            char secondKey = str.charAt(i+1);
            int firstValue = charIndexMap.get(firstKey);
            int secondValue = charIndexMap.get(secondKey);
            int calc = Math.abs(firstValue - secondValue);
            score += calc;
        }
        return score;
    }

}
