package strings;

public class ImplementStrStr {

    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        String pattern = "Fr";
        int result = findFirstOccurenceOfPattern(str, pattern);
        System.out.println(result);
    }

    public static int findFirstOccurenceOfPattern(String str, String pattern) {
        int index = -1;
        for(int i=0; i<=str.length() - pattern.length(); i++) {
            int j;
            for(j=0; j<pattern.length(); j++) {
                if(pattern.charAt(j) != str.charAt(i+j)) {
                    break;
                }
            }
            if(j == pattern.length()) {
                return i;
            }
        }
        return index;
    }

}
