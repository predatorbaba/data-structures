package strings;

public class CheckStringIsogram {

    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(isIsogram(str));
    }

    public static int isIsogram(String str) {
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        for(int i=0; i<str.length(); i++) {
            charArr[str.charAt(i)]++;
        }
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] > 1) {
                return 0;
            }
        }
        return 1;
    }

}
