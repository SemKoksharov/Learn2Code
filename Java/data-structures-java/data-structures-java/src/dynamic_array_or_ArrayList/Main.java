package dynamic_array_or_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        An ArrayList in Java provides dynamic arrays and is useful for:

        - Storing elements that need frequent access by index
        - Scenarios where you expect to add/remove elements at the end of the list
        - Cases where random access of elements is more important than insertion/deletion efficiency

        ArrayList is implemented as a resizable array.
        This means that the underlying array can grow and shrink dynamically.

        Operations and their time complexities:

        - Insertion at the beginning (add(0, element)): O(n)
        - Insertion at the end (add(element)): O(1) amortized
            What does "O(1) amortized" mean?
            - ArrayList internally uses a dynamic array.
            - When adding an element, if there is still capacity in the array, the insertion takes constant time, O(1).
            - However, if the array is full, a new, larger array is created, and all elements are copied over.
              This copying process is O(n) for that specific operation, but it happens infrequently.
            - Amortized O(1) means that, over a sequence of multiple insertions, the average time per insertion is still O(1),
              because the costly resizing operation happens less frequently as the array grows larger.

        - Insertion in the middle by index (add(index, element)): O(n)
        - Deletion at the beginning (remove(0)): O(n)
        - Deletion at the end (remove(size-1)): O(1)
        - Deletion in the middle by index (remove(index)): O(n)
        - Deletion by value (remove(Object o)): O(n)
        - Access by index (get(index)): O(1)
        - Searching for an element (contains(Object o)): O(n)
        - Iteration over the list: O(n)

        Due to the nature of ArrayList, it's better suited for scenarios where you need fast random access,
        frequent additions or removals at the end of the list, and when the size of the list doesn't change frequently.
        However, it is less efficient for operations that involve inserting or removing elements from the beginning or middle.
         */

        ArrayList<String> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        // Note: Adding at the end has an O(1) amortized time complexity
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        System.out.printf("Array List: %s%n", arrayList);

        // Accessing elements by index
        // Note: Access by index is O(1)
        String element = arrayList.get(2);
        System.out.printf("Element at index 2: %s%n", element);

        // Inserting element in the middle of the ArrayList
        // Note: This operation has O(n) complexity due to the need to shift elements
        arrayList.add(2, "X");
        System.out.printf("After adding element at index 2: %s%n", arrayList);

        // Removing by index
        // Note: This operation has O(n) complexity as elements need to be shifted
        arrayList.remove(2);
        System.out.printf("After removing element at index 2: %s%n", arrayList);

        // Removing by value
        // Note: This operation has O(n) complexity due to the need to search for the element
        arrayList.remove("B");
        System.out.printf("After removing element 'B': %s%n", arrayList);

        // Iterating over the ArrayList
        // Note: Iteration is O(n)
        System.out.println("Iterating over the ArrayList:");
        for (String s : arrayList) {
            System.out.println(s);
        }

        // Adding multiple elements at once
        arrayList.addAll(List.of("E", "F", "G"));
        System.out.printf("Array List after adding multiple elements: %s%n", arrayList);

        // Trimming the ArrayList to its size (optional, to save memory)
        arrayList.trimToSize();
    }
}
