package strings;

public class SumOfNumberInStrings {

    public static void main(String[] args) {
        String str = "1abc23";
        int result = calculateSum(str);
        System.out.println(result);
    }

    public static int calculateSum(String str) {
        int sum = 0;
        int number = 0;
        boolean isNumber = false;
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
                isNumber = true;
            } else {
                if(isNumber) {
                    sum += number;
                    number = 0;
                    isNumber = false;
                }
            }
        }
        if(isNumber) {
            sum += number;
        }

        return sum;
    }

}
