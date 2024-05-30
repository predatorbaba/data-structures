package linkedlists;

public class BasicImplementation {

    public static void main(String[] args) {

        LinkedListNode<String> head = new LinkedListNode<>("First Node");
        LinkedListNode<String> node1 = new LinkedListNode<>("Second Node");
        LinkedListNode<String> node2 = new LinkedListNode<>("Last Node");

        head.nextNode = node1;
        node1.nextNode = node2;

        printLinkedList(head);

    }

    public static void printLinkedList(LinkedListNode<String> head) {
        LinkedListNode<String> currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
    }

}
