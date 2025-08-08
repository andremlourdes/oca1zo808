package tq35;

/*
🧠 What does the code do?
The code defines a class Test with a main method that calls another method called m1.
The m1 method prints a message to the console.
Thread explanation line by line...
 */

public class Test {
    /*
    Define a public class called Test.
     */
    public static void main(String[] args) {
        m1(); //Line
        /*
        Main method main, entry point of the program.Calls the method m1.
         */
    }

    private static void m1() throws Exception { //Line 6
        System.out.println("NOT THROWING ANY EXCEPTION"); //Line 7
        /*
        m1 is a private static method that declares it can throw an exception (throws Exception).But in practice,
         it does not throw any exception, it just prints "NOT THROWING ANY EXCEPTION".
         🤔 Why use throws Exception if no exception is thrown? Great question!It may be for precaution,
         in case the method later includes operations that could throw exceptions (for example, file reading,
          networking, etc.).It could also be an educational example to show how exception declarations work.
          ✅ What happens when the code runs? The message "NOT THROWING ANY EXCEPTION"
          appears on the console.No exceptions are thrown, so the program ends normally.
         */
    }
}
