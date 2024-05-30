package linkedlists;

public class LinkedListNode<T> {

    public T data;
    public LinkedListNode<T> nextNode;

    public LinkedListNode(T data) {
        this.data = data;
        this.nextNode = null;
    }

}
