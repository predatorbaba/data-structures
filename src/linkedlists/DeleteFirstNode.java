package linkedlists;

public class DeleteFirstNode {

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

        head = deleteFirstNode(head);
        LinkedListNode<Integer> currentNode = head;
        while(currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.nextNode;
        }
    }

    public static LinkedListNode<Integer> deleteFirstNode(LinkedListNode<Integer> head) {
        if(head == null) return head;
        if(head.nextNode == null) return null;
        return head.nextNode;
    }

}
