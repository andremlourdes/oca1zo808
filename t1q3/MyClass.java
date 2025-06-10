package t1q3;

public class MyClass {
    private final String value;

    public MyClass(String value) {
        this.value = value;
    }

    public int getValueLength() {
        return value != null ? value.length() : 0;
    }

    public String getValue() {
        return value;
    }
}