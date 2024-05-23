package strings;

public class CheckStringRotations {

    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        boolean result = areRotatedStrings(str1, str2);
        boolean result1 = areRotatedStringsMoreEfficient(str1, str2);
        System.out.println(result);
        System.out.println(result1);
    }

    public static boolean areRotatedStrings(String str1, String str2) {
        return (str1.length() == str2.length()) && ((str1+str1).indexOf(str2) != -1);
    }

    public static boolean areRotatedStringsMoreEfficient(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        if(str1Length != str2Length) return false;
        else {
            for(int i=0; i<str1.length(); i++) {
                if(str1.charAt(i) == str2.charAt(0))
                    if(str1.substring(i).equals(str2.substring(0, str1.length() - i)))
                        if(str1.substring(0, i).equals(str2.substring(str1.length() - i))) return true;
            }
        }
        return false;
    }

}
