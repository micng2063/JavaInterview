// How do you reverse a linked list in Java?

// LinkedList descendingIterator() returns an iterator that iterates over the element in reverse order.
// The following example code shows how to use this iterator to create a new Linked List with elements listed
// in the reverse order:

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        linkedList.descendingIterator().forEachRemaining(linkedList1::add);

        System.out.println(linkedList1);
    }
}
