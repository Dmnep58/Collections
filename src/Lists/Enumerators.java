package Lists;

import java.util.Enumeration;
import java.util.Vector;

/*
Cursors
Enumerators is used to get object one by one from legacy collection objects.

Disadvantages
--> can be applied for legacy classes
--> it is not a universal cursor
--> We can get only read access and cant perform remove operation.

 */
public class Enumerators {
    public static void main(String[] args) {
        Vector v = new Vector();

        for(int i=0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v);


        // print the even numbers.
        Enumeration e = v.elements();
        System.out.println("Even numbers are: ");
        while(e.hasMoreElements()){
            Integer i = (Integer) e.nextElement();
            if(i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
}
