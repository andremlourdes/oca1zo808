package tq27;
/*
Package and Import
Define the package where the code is located.Imports the LocalDate class from the Java API,
used to work with dates (without time).
 */
import java.time.LocalDate;
/*
This code tries to customize the representation of a date using inheritance from the LocalDate class,
 but there is a fundamental error that prevents compilation. Let's break down what is happening:
 */
/*
Class MyLocalDate
This part tries to extend LocalDate,
 which is not allowed because LocalDate is a final class.Final classes in Java cannot be extended,
 meaning you cannot create subclasses from them.
 */
class MyLocalDate {
    /*
    So this line: would cause a compilation error.
     */
    private LocalDate date;

    public MyLocalDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.getDayOfMonth() + "-" + date.getMonthValue() +
                "-" + date.getYear();
    }
}
/*
Valid Alternative If you want to customize the date format,
class MyLocalDate {
    private LocalDate date;

    public MyLocalDate(String isoDate) {
        this.date = LocalDate.parse(isoDate);
    }

    @Override
    public String toString() {
        return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
    }
}

public class Test {
    public static void main(String[] args) {
        MyLocalDate date = new MyLocalDate("1980-03-16");
        System.out.println(date); // Saída: 16-3-1980
    }
}
a correct approach would be composition (having a LocalDate as an attribute)
instead of inheritance:This works perfectly and keeps the code clean and functional.
 */