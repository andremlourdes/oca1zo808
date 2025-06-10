package t1q9;

import java.time.LocalTime;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
        //Há um erro aqui

       //está mal estruturada. O operador ternário (? :) requer sempre uma parte que define o valor a ser retornado caso a condição seja falsa.
        //Essa linha deveria estar formatada corretamente, por exemplo:
        //String amPm = time.getHour() >= 12 ? "PM" : "AM";
        //ou, caso quisesse uma lógica separada para time.getHour() == 12:
        //String amPm = (time.getHour() == 12) ? "PM" : (time.getHour() > 12) ? "PM" : "AM";
        //Após corrigir, a saída esperada seria:
        // "PM" para 16:40, pois é tarde da tarde.
        //This question is on ternary operator (?:). If an expression has multiple ternary operators then number of ? and : should match.
        //Given expression contains 2 ? and 1 : and hence Compilation Error.
        //
        System.out.println(amPm);
    }
}
