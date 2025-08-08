package tq40;


public class Test {
    public static void main(String[] args) {
        A obj1 = new A();  //obj1 is an instance of A
        B obj2 = (B)obj1;  //attempt to cast for B
        obj2.print();      //call of the print() method
    }
}
 /*
 ⚠️ What is happening? obj1 is created as an instance of class A.
  Then the code tries to explicitly cast obj1 to B. But obj1 is not an instance of B,
   so this is not allowed at runtime.
   ❌ Result: The code compiles, but when executed, it throws:

   Exception in thread "main" java.lang.ClassCastException: class package tq40.A cannot be cast to class com.package tq40a.B
✅ How to avoid this? You could use the instanceof operator to check before casting:
if (obj1 instanceof B) {
    B obj2 = (B)obj1;
    obj2.print();
} else {
    System.out.println("obj1 não é uma instância de B");
}
Or simply create obj1 as an instance of B:
A obj1 = new B(); // válido, pois B é um subtipo de A
B obj2 = (B)obj1; // agora o cast funciona
obj2.print();     // imprime "B"
Here is a simple visual representation of the class hierarchy in your example:
        A
        ↑
        |
        B

And in the code:
A obj1 = new A(); // obj1 is an instance of class AB obj2 = (B)obj1; // attempt to cast A to B (invalid)
🧠 Explaining the hierarchyB inherits from A using extends,
so B is a subclass of A.A is the superclass.
This means that every object of B is also an A, but not every A is a B.

Valid:
A obj1 = new B(); // B is a type of AB obj2 = (B)obj1; // Cast works because obj1 is actually a B

❌Invalid: A obj1 = new A(); // obj1 is just an AB obj2 = (B)obj1; // Runtime error: ClassCastException

Class A and B are declared public and inside same package com.udayan.oca. Method print() of class A has correctly been overridden by B.

print() method is public so no issues in accessing it anywhere.



Let's check the code inside main method.

A obj1 = new A(); => obj1 refers to an instance of class A.

B obj2 = (B)obj1; => obj1 is of type A and it is assigned to obj2 (B type), hence explicit casting is necessary.
obj1 refers to an instance of class A, so at runtime obj2 will also refer to an instance of class A.
sub type can't refer to an object of super type so at runtime B obj2 = (B)obj1; will throw ClassCastException.
  */
