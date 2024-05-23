package strings;

public class DefangingIPAddress {

    public static void main(String[] args) {
        String str = "1.1.1.1";
        String defangedIP = defangIP(str);
        System.out.println(defangedIP);
    }

    public static String defangIP(String str) {
        StringBuilder defangIP = new StringBuilder();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '.') {
                String defangSymbol = "[.]";
                defangIP.append(defangSymbol);
            } else {
                defangIP.append(ch);
            }
        }
        return defangIP.toString();
    }

}
