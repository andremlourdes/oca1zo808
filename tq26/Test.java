package tq26;

import java.util.ArrayList;
import java.util.List;
/*
These lines bring classes from the standard library:List is
 an interface that represents an ordered list.ArrayList is an implementation of the List interface based on dynamic arrays.
 */

public class Test {
    /*
    This defines the class called Test, with the main method, the entry point of the program.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /*
        Here, you are creating an ArrayList that stores values of type Integer.
         */
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        /*
        These lines add four elements to the list, in order
         */
        list.remove(100);
        /*
        Here is the most interesting detail. Although it seems like you are trying to remove the number 100,
         the method remove(int index) is being called — that is, it removes the element at position 100.💡
         However, the list does not have 100 positions (it only has 4 elements). This throws an exception:
         IndexOutOfBoundsException
         */

        //**************************************************************************************************//

        /*
        How to fix: to remove the value 100 (and not the index), you need to use:
        list.remove(Integer.valueOf(100));
        This ensures that the method remove(Object o) is called instead of the version that removes by index.

         */

        System.out.println(list);
    }
}
