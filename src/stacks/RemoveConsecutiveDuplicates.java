package stacks;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('a');
        stack.push('b');
        stack.push('b');
        stack.push('c');
        stack.push('c');
        removeConsecutiveDuplicates(stack);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void removeConsecutiveDuplicates(Stack<Character> stack) {
        Stack<Character> tempStack = new Stack<>();
        tempStack.push(stack.pop());
        while (!stack.isEmpty()) {
            Character currentElement = stack.pop();
            if (!currentElement.equals(tempStack.peek())) {
                tempStack.push(currentElement);
            }
        }
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

}
