package tq33;

public class Test {
    public static void main(String[] args) {
        /*
        Let's break down this code and understand what's happening 🧠💥
        🧨 Main problem This code seems to want to print "Output is: true" or "Output is: false", but it does not compile!
        ⚙️ What is wrong?

         The expression is trying to compare a String with 5 using !=, which doesn't make sense.
         Let's see how Java interprets this:"Output is: " + 10 → this results in a String: "Output is: 10"Then,
         it tries to do: "Output is: 10" != 5 → This causes a compilation error because it is comparing a String with an int using !=
         ✅ How to fixIf you want to compare 10 != 5 and then print the result along with the text,
         you need to use parentheses so that the comparison is done before the concatenation:
         System.out.println("Output is: " + (10 != 5));
         🖨️ Corrected result
         Output is: true
         */
        //System.out.println("Output is: " + 10 != 5);
    }
}
