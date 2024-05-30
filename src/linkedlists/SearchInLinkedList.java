package linkedlists;

import java.util.Objects;

public class SearchInLinkedList {

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

        Integer index = searchInLinkedList(head, 30);
        System.out.println(index);
    }

    public static Integer searchInLinkedList(LinkedListNode<Integer> head, Integer elementToSearch) {
        LinkedListNode<Integer> currentNode = head;
        int index = 1;
        while(currentNode != null) {
            if(Objects.equals(currentNode.data, elementToSearch)) return index;
            index++;
            currentNode = currentNode.nextNode;
        }
        return -1;
    }

}
