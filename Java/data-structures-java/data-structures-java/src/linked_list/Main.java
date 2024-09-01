package linked_list;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        A linked list in Java can behave like a queue or a stack.
        It can be useful for:

        - Playlists
        - GPS routes
        - Queue or stack implementations

        By default, in Java LinkedList is a Doubly Linked List.
        This means that each node contains references to the previous and next element.

        Operations and their time complexities:

        - Insertion at the beginning (addFirst()): O(1)
        - Insertion at the end (addLast() or add()): O(1)
        - Insertion in the middle by index (add(index, element)): O(n)
        - Deletion at the beginning (removeFirst() or poll()): O(1)
        - Deletion at the end (removeLast()): O(1)
        - Deletion in the middle by index (remove(index)): O(n)
        - Deletion by value (remove(Object o)): O(n)
        - Access by index (get(index)): O(n)
        - Searching for an element (contains(Object o)): O(n)
        - Iteration over the list: O(n)

        Due to the nature of LinkedList, it's better suited for frequent insertions
        and deletions, especially at the beginning or end of the list.
        However, random access by index is slower compared to ArrayList.
         */

        LinkedList<String> linkedListAsAStack = new LinkedList<>();

        // In this case the linked list behaves as a Stack
        // (Principle is called "First In Last Out" or "FILO")

        linkedListAsAStack.push("A");
        linkedListAsAStack.push("B");
        linkedListAsAStack.push("C");
        linkedListAsAStack.push("D");

        System.out.printf("Linked List as a Stack: %s%n", linkedListAsAStack);

        // In this case, we can use .pop() to remove an element
        // Element "D" will be removed (O(1) operation)
        linkedListAsAStack.pop();
        System.out.printf("After .pop() : %s%n", linkedListAsAStack);


        // In this case the linked list behaves as a Queue
        // (Principle is called "First In First Out" or "FIFO")

        LinkedList<String> linkedListAsAQueue = new LinkedList<>();

        linkedListAsAQueue.offer("A");
        linkedListAsAQueue.offer("B");
        linkedListAsAQueue.offer("C");
        linkedListAsAQueue.offer("D");

        System.out.printf("Linked List as a Queue: %s%n", linkedListAsAQueue);

        // In this case, we can use .poll() to remove an element
        // Element "A" will be removed (O(1) operation)
        linkedListAsAQueue.poll();

        System.out.printf("After .poll() : %s%n", linkedListAsAQueue);

        // Let's create a new LinkedList
        LinkedList<String> newLinkedList = new LinkedList<>(List.of("A", "B", "C", "D", "F"));

        System.out.printf("New Linked List: %s%n", newLinkedList);
        // We can add an element to the middle of the list
        // Note: This operation has O(n) complexity
        newLinkedList.add(4, "E");

        System.out.printf("Updated Linked List with new element: %s%n", newLinkedList);
        // Removing by index
        // Note: This operation has O(n) complexity as it requires traversing the list
        newLinkedList.remove(4);

        // Removing by value
        // Note: This operation has O(n) complexity due to the need to search for the element
        newLinkedList.remove("B");
    }
}
