package tq19;

public class Test {
    public static void main(String[] args) {
        String [] arr = {"I", "N", "S", "E", "R", "T"};
        for(int n = 0; n < arr.length; n += 1) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.print(arr[n]); //Line n1
        }
    }
}


