package strings;

public class NaivePatternSearching {

    public static void main(String[] args) {
        String str = "ABCDABCDAB";
        String str1 = "AB";
        printIndexWherePatternMatches(str, str1);
    }

    public static void printIndexWherePatternMatches(String str, String str1) {
        for(int i = 0; i <= str.length() - str1.length(); i++) {
            int j;
            for(j = 0; j < str1.length(); j++) {
                if(str1.charAt(j) != str.charAt(i+j)) {
                    break;
                }
            }
            if(j == str1.length()) {
                System.out.println(i + " ");
            }
        }
    }

}
