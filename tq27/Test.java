package tq27;

import java.time.LocalDate;
/*
Outra inconsistência: você está tentando atribuir um objeto de LocalDate para uma variável do tipo MyLocalDate,
 o que também não compila, porque LocalDate.parse(...) retorna um objeto do tipo LocalDate, não MyLocalDate.
 Code IssuesProblem ExplanationLocalDate is final Cannot be extendedIncorrect assignment MyLocalDate date = LocalDate.parse(...)
 is not validInheritance and type error The code does not compile because of this
 */
public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("1980-03-16");
        System.out.println(date);
    }
}