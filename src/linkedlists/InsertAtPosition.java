package linkedlists;

public class InsertAtPosition {

    public static void main(String[] args) {

        LinkedListNode<Integer> head = new LinkedListNode<>(10);
        LinkedListNode<Integer> node1 = new LinkedListNode<>(20);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(30);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(40);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(50);

        head.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;

        head = insertAtPosition(head, 3, 25);
        LinkedListNode<Integer> currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }

    }

    public static LinkedListNode<Integer> insertAtPosition(LinkedListNode<Integer> head, Integer position, Integer newNodeValue) {
        LinkedListNode<Integer> newNode = new LinkedListNode<>(newNodeValue);
        if(head == null) return head;
        if(position == 1) {
            newNode.nextNode = head;
            return newNode;
        }
        LinkedListNode<Integer> prev = head;
        for(int i=1; i<position-1; i++) {
            prev = prev.nextNode;
        }
        newNode.nextNode = prev.nextNode;
        prev.nextNode = newNode;
        return head;
    }

}
