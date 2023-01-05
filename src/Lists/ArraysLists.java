package Lists;

/*
It is a collection frame works
Underlined data Structure is array which is resizeable.
where duplicates are allowed.
insertion order is preserved.
Default initialled capacity is 10  ( current capacity x 3/2 +1 ).

 */

import java.util.ArrayList;

public class ArraysLists {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1,40);
        a.add(50);

        System.out.println(a);

        a.remove(2);
        System.out.println(a);

        System.out.println(a.isEmpty());

    }
}
