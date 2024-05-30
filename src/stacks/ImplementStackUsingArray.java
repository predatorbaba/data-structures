package stacks;

public class ImplementStackUsingArray {

    public static void main(String[] args) {

        ArrayStack myStack = new ArrayStack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.isEmpty());
    }

}

