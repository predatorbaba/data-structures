package strings;

public class KeypadTyping {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String result = findKeypadNumbers(str);
        System.out.println(result);
    }

    public static String findKeypadNumbers(String str) {
        String result = "";
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'c') {
                result += '2';
            } else if(ch >= 'd' && ch <= 'f') {
                result += '3';
            } else if(ch >= 'g' && ch <= 'i') {
                result += '4';
            } else if(ch >= 'j' && ch <= 'l') {
                result += '5';
            } else if(ch >= 'm' && ch <= 'o') {
                result += '6';
            } else if(ch >= 'p' && ch <= 's') {
                result += '7';
            } else if(ch >= 't' && ch <= 'v') {
                result += '8';
            } else if(ch >= 'w' && ch <= 'z') {
                result += '9';
            }
        }
        return result;
    }

}
