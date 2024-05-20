package strings;

public class BinarySubString {

    public static void main(String[] args) {
        String binaryString = "01101"; // 101,10101,1010101,101,10101,101
        int result = countAllPossibleBinarySubstringThatStartsAndEndsWithOne(binaryString);
        int result1 = countAllPossibleBinarySubstringThatStartsAndEndsWithOneEfficientMethod(binaryString);
        System.out.println(result);
        System.out.println(result1);
    }

    public static int countAllPossibleBinarySubstringThatStartsAndEndsWithOne(String str) {
        int count = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != '0') {
                for(int j=i+1; j<str.length(); j++) {
                    if(str.charAt(j) == '1') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int countAllPossibleBinarySubstringThatStartsAndEndsWithOneEfficientMethod(String str) {
        int countOfOnes = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1') {
                countOfOnes++;
            }
        }
        return countOfOnes * (countOfOnes - 1) / 2;
    }

}
