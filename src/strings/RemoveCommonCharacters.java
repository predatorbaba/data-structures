package strings;

public class RemoveCommonCharacters {

    public static void main(String[] args) {
        String str1 = "aacdb";
        String str2 = "gafd";
        String result = removeCommonCharacters(str1, str2);
        System.out.println(result);
    }

    public static String removeCommonCharacters(String str1, String str2) {
        int CHAR = 256;
        boolean[] isVisitedChars1 = new boolean[CHAR];
        boolean[] isVisitedChars2 = new boolean[CHAR];

        for(int i=0; i<str1.length(); i++) {
            isVisitedChars1[str1.charAt(i)] = true;
        }
        for(int i=0; i<str2.length(); i++) {
            isVisitedChars2[str2.charAt(i)] = true;
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str1.length(); i++) {
            if(!isVisitedChars2[str1.charAt(i)]) {
                result.append(str1.charAt(i));
            }
        }
        for(int i=0; i<str2.length(); i++) {
            char c = (char) i;
            if(!isVisitedChars1[str2.charAt(i)]) {
                result.append(str2.charAt(i));
            }
        }
        if(result.isEmpty()) {
            return "-1";
        }
        return result.toString();
    }

}
