package tq28;

/*
This Java code is simple,
 but it hides a curious and very important behavior about reference types and autoboxing. Let's analyze it step by step 👇:
  /*
  Declares a public class named Test👇
 */
public class Test {
    /*
    Entry point of the application. It's where everything starts!👇
     */
    public static void main(String[] args) {
        /*
        An array of Double objects is created with two elements.Since there is no direct assignment of values,
        the two elements (arr[0] and arr[1]) are automatically initialized as null (default value for objects in Java).
         */
        Double [] arr = new Double[2];
        /*
        Here is the critical point:What happens when you try to add null + null using Double objects?
        Java will attempt to perform autoboxing: converting the Double objects to double in order to carry out the addition operation.
        But since the values are null, this results in a NullPointerException!
         */
        System.out.println(arr[0] + arr[1]);
    }
}
/*
T💥 Final ResultThe program compiles normally, but when running, it throws an exception:
Exception in thread "main" java.lang.NullPointerException
    at Test.main(Test.java:5)
✅ SolutionIf you want the operation to work, you need to initialize the values in the array:
Double[] arr = new Double[2];
arr[0] = 10.0;
arr[1] = 15.5;
System.out.println(arr[0] + arr[1]); // Saída: 25.5


 */
