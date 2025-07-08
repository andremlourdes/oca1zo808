package tq31;

public class Test {
    public static void main(String[] args) {
        /*
        An array of Object with 4 positions (indices 0 to 3).
         */
        Object [] arr = new Object[4];
        /*
        Loop i = 1 to 3 using switch to store different types of objects in positions 1, 2, and 3 of the array:
        arr[1]: String
        object arr[2]: StringBuilder
        object arr[3]: SpecialString
        object arr[0] remains null.
         */
        for(int i = 1; i <=3; i++) {
            switch(i) {
                case 1:
                    arr[i] = new String("Java");
                    break;
                case 2:
                    arr[i] = new StringBuilder("Java");
                    break;
                case 3:
                    arr[i] = new SpecialString("Java");
                    break;
            }
        }
        for(Object obj : arr) {
            /*
            Iterates through all the elements of the array and prints each one:null → prints nothing
            or "null""Java" → prints the string directlyStringBuilder("Java") → prints Java because StringBuilder has a toString()
            that returns the contentSpecialString("Java") → prints something like com.udayan.oca.SpecialString@<hash>
            because it doesn’t have a custom toString()
             */
            System.out.println(obj);
            /*
            Assuming the standard format of toString() for non-overridden objects, the output would be:
               null
               Java
               Java
               tq31.SpecialString@1b6d358
               If you want the SpecialString class to print only 'Java' as well, just override the toString() method:
               @Override
               public String toString() {
               return str;
}             */
        }
    }
}
