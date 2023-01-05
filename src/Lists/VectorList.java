package Lists;

import java.util.Vector;

/*
Underlined Data structure is Resizeable array
--> insertion order is preserved
--> Duplicates are allowed
--> NUll insertion is possible
--> Every method present in vector is synchronized so vector object is thread safe.
--> implements serializable , cloneable and RandomAccess interfaces.
--> initial capacity is 10 ( current capacity x 2 )
 */
public class VectorList {
    public static void main(String[] args) {
        Vector v = new Vector();

        v.add("I");
        v.add("AM");
        v.add("Devi");
        v.add("Prasad");
        v.add("Mishra");

        System.out.println(v);

        v.add(2,"not");
        System.out.println(v);

        System.out.println(v.size());
        System.out.println(v.capacity());

        System.out.println(v.remove(2));

        v.removeAllElements();
        System.out.println(v);

    }
}
