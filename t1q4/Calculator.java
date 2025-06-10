package t1q4;

public class Calculator {
    private int value;

    public Calculator(int value) {
        this.value = value;
    }

    public int negateAndIncrement() {
        return -value++;
    }

    public int getValue() {
        return value;
    }
}