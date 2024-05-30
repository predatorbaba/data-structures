package stacks;

public class ArrayStack {

    int[] arr;
    int top;
    int arrCapacity;
    public ArrayStack(int arrCapacity) {
        this.arrCapacity = arrCapacity;
        top = -1;
        arr = new int[arrCapacity];
    }

    public void push(int value) {
        if(this.top == (this.arrCapacity - 1)) {
            System.out.println("Overflow");
            return;
        }
        top++;
        arr[top] = value;
    }

    public int pop() {
        if(this.top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        int temp = arr[top];
        top--;
        return temp;
    }

    public int peek() {
        if(this.top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top];
    }

    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        if(top == -1) return true;
        else return false;
    }

}
