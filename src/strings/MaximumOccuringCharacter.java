package strings;

public class MaximumOccuringCharacter {

    public static void main(String[] args) {
        String str = "output";
        char result = findMaximumOccuringCharacter(str);
        System.out.println(result);
    }

    public static char findMaximumOccuringCharacter(String str) {
        int CHAR = 256;
        int[] charArr = new int[CHAR];
        for(int i=0; i<str.length(); i++) {
            charArr[str.charAt(i)]++;
        }
        int res = 0;
        int idx = -1;
        for(int i=0; i<CHAR; i++) {
            if(charArr[i] > res) {
                res = Math.max(res, charArr[i]);
                idx = i;
            }
        }
        return (char) (idx);
    }

}
