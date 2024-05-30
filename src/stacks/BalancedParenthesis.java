package stacks;

import java.util.ArrayDeque;

public class BalancedParenthesis {

    public static void main(String[] args) {
        String str = "{}{(}))}";
        boolean result = isStringBalanced(str);
        System.out.println(result);
    }

    public static boolean isStringBalanced(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if(ch == ')') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if (peek == '(') stack.pop();
                    else return false;
                }
                else return false;
            }
            else if(ch == '}') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if(peek == '{') stack.pop();
                    else return false;
                }
                else return false;
            }
            else if(ch == ']') {
                if(!stack.isEmpty()) {
                    char peek = stack.peek();
                    if(peek == '[') stack.pop();
                    else return false;
                }
                else return false;
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }

}
