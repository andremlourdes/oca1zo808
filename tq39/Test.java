package tq39;

import java.util.ArrayList;
import java.util.List;

/*
 * 🔍 Detailed execution flowThe array names has 5 elements.
 * The for loop starts with x = 0.On each iteration:names[x] is added to the list.The switch checks if x == 2. If it is,
 *  it executes continue, which skips the rest of the loop and goes to the next iteration.If it is not 2, the break is executed,
 *  ending the loop.🧠 Step by step realx = 0:list.add("Smith")switch(0) → it is not case 2,
 *  so it falls to the breakLoop ends📌 Final resultOnly "Smith" was added to the list.The loop was terminated in the first iteration.
 * Therefore, list.size() will be 1.
 *
 * reak; and continue; are used inside for-loop, hence no compilation error.

In 1st iteration, x = 0. "Smith" is added to the list. There is no matching case found, hence control just goes after the switch-case block and executes break; statement, which takes the control out of the for loop. `System.out.println(list.size());` is executed and this prints 1 on to the console.
 */

public class Test {
    public static void main(String[] args) {
        String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
        List<String> list = new ArrayList<>();
        for (int x = 0; x < names.length; x++) {
            list.add(names[x]);
            switch (x) {
                case 2:
                    continue;
            }
            break;
        }
        System.out.println(list.size());
    }
}








