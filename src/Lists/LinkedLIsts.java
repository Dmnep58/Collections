package Lists;

import java.util.LinkedList;

/*
Underlined data structure is Doubly linked list
--> insertion order is preserved
--> Duplicates are allowed
--> null insertion is possible
--> Best choice for insertion or deletion in the middle
--> implements serializable and cloneable interfaces but not RandomAccess

 */
public class LinkedLIsts {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.addFirst(0);
        l.addLast(30);

        System.out.println(l);

        int b = (int) l.getFirst();
        System.out.println("First element "+b);

        System.out.println("last element "+l.getLast());

        System.out.println("Deleted first element "+l.removeFirst());
        System.out.println("Deleted last element "+l.removeLast());

    }
}
