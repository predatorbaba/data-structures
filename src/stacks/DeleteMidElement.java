package stacks;

import java.util.Stack;

public class DeleteMidElement {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        deleteMid(stack);
    }

    public static void deleteMid(Stack<Integer> stack) {
        int size = stack.size();
        if(stack.isEmpty()) return;
        int midIndex = size / 2;
        Stack<Integer> backupStack = new Stack<>();
        for(int i=0; i<midIndex; i++) {
            Integer currentElement = stack.peek();
            stack.pop();
            backupStack.push(currentElement);
        }
        stack.pop();
        while(!backupStack.isEmpty()) {
            Integer currentElement = backupStack.peek();
            stack.push(currentElement);
            backupStack.pop();
        }
        for(int i=0; i<stack.size(); i++) {
            System.out.println(stack.get(i));
        }
    }

}
