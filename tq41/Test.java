package tq41;

public class Test {
    public static void main(String[] args) {
        String str1 = new String("Core");
        String str2 = new String("CoRe");
        System.out.println(str1 = str2);
    }
}

/*
What is happening here?str1 is created with the value "Core".str2 is created with the value "CoRe".
The line System.out.println(str1 = str2); is not comparing the values. It is assigning str2 to str1.
🧠 Important detailsThe operator = is for assignment, not for comparison.After this line,
str1 starts to reference the same object as str2, that is, "CoRe".The println method prints the value of str1, which is now "CoRe".
 */