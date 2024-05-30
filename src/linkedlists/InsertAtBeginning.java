package linkedlists;

public class InsertAtBeginning {

    public static void main(String[] args) {

        LinkedListNode<Integer> head = new LinkedListNode<>(10);
        LinkedListNode<Integer> node1 = new LinkedListNode<>(20);
        LinkedListNode<Integer> node2 = new LinkedListNode<>(30);
        LinkedListNode<Integer> node3 = new LinkedListNode<>(40);
        LinkedListNode<Integer> node4 = new LinkedListNode<>(50);
        LinkedListNode<Integer> nodeToBeInserted = new LinkedListNode<>(60);

        head.nextNode = node1;
        node1.nextNode = node2;
        node2.nextNode = node3;
        node3.nextNode = node4;

        insertAtBeginning(head, nodeToBeInserted);
        LinkedListNode<Integer> head1 = null;
        head1 = insertAtBeginning1(head1, 100);
        head1 = insertAtBeginning1(head1, 200);
        head1 = insertAtBeginning1(head1, 300);
        head1 = insertAtBeginning1(head1, 400);
        while(head1 != null) {
            System.out.println(head1.data);
            head1 = head1.nextNode;
        }
    }

    public static void insertAtBeginning(LinkedListNode<Integer> head, LinkedListNode<Integer> nodeToBeInserted) {
        if(head == null) {
            head = nodeToBeInserted;
            return;
        }
        LinkedListNode<Integer> olderHead = head;
        head = nodeToBeInserted;
        nodeToBeInserted.nextNode = olderHead;
        while(head != null) {
            System.out.println(head.data);
            head = head.nextNode;
        }
    }

    public static LinkedListNode<Integer> insertAtBeginning1(LinkedListNode<Integer> head, Integer newNodeValue) {
        LinkedListNode<Integer> node = new LinkedListNode<>(newNodeValue);
        node.nextNode = head;
        return node;
    }

}
