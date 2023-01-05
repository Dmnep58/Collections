package Lists;

import java.util.Iterator;
import java.util.Vector;

/*
To overcome the limitations of Enumeration Iterations are used

--> Can be applied for any collection object (Arraylist , vector ,stack etc. ) and hence it is universal cursor
--> we can perform both read and remove operations

DisAdvantages
--> Cant be moved backward direction (single direction cursor)
--> cant perform replacement and addition operation
 */
public class Iterations {
    public static void main(String[] args) {

        Vector v = new Vector();

        for (int i=0; i<9;i++){
            v.addElement(i);
        }
        System.out.println(v);

        // print even numbers.
        Iterator itr = v.iterator();

        System.out.println("Even numbers are: ");
        while (itr.hasNext()){
            Integer i = (Integer) itr.next();
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}
