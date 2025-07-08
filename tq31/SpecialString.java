/*
Define the package where the class is located. This helps in organizing the code in larger projects.
 */
package tq31;

class SpecialString {
    /*
    A simple class with a str field and a constructor that initializes that field.Important:
    it does not override the toString() method, so when printed,
    it will show something like tq31.SpecialString@1b6d3586
     */
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}