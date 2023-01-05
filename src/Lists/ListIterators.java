package Lists;

import java.util.LinkedList;
import java.util.ListIterator;

/*
To overcome the disadvantages of iterators List iterators are used.
List iterator is the child interface of iterator.

--> Can be moved in both directions ( Bidirectional Cursor ).
--> Replacement and Addition operations can be preformed.

 */
public class ListIterators {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();

        l.add("Devi Prasad Mishra");
        l.add("10");
        l.add("20");
        l.add("Pawan");

        System.out.println(l);

        ListIterator itr = l.listIterator();

        while (itr.hasNext()){
            String s = (String) itr.next();

            if(s.equals("10")){
                itr.remove();
                System.out.println(l); // remove 10 if present
            }
            else if (s.equals("Pawan")) {
                itr.add("Kumar"); // add kumar after pawan
                System.out.println(l);
            }
            else if(s.equals("Devi")){
                itr.set("Priyanka"); // if devi then replace by Priyanka
                System.out.println(l);
            }
        }

        System.out.println("previous: ");
        if(itr.hasPrevious()){
            System.out.println(l);
        }
    }

}
