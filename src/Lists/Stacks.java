package Lists;

import java.util.Stack;

/*
Underlined Data structure is stack
--> Based on lifo principle
--> Child interface of vector
 */
public class Stacks {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.pop();
        s.push(30);

        System.out.println(s);


        System.out.println(s.search(20));
    }
}
