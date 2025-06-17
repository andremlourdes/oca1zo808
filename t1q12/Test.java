package t1q12;

public class Test {
    public static void main(String[] args) {
        try {
            if (args.length > 0) {
                return; // Condição de saída
            }
            main(new String[]{"stop"});
        } catch (Exception ex) {
            System.out.println("CATCH-");
        }
        System.out.println("OUT");
    }
}