/*
To extract the country code (the 5th and 6th characters) from a SWIFT code stored in a variable swiftCode,
you should use a method that retrieves this specific substring.
The substring(int startIndex, int endIndex) method returns the characters between the specified indices:
swiftCode.substring(4, 6) starts at index 4 (keeping in mind that the index starts at 0)It goes up to,
 but does not include, index 6Thus, it extracts the 5th and 6th characters — which correspond to the country code in the SWIFT format.
 */

package tq32;

public class SwiftCodeValidator {
    public static void main(String[] args) {
        String swiftCode = "ICICINBBRT4";
/*
Let's include a check to ensure that the SWIFT code is in the expected format before extracting the country code.
 This avoids errors like IndexOutOfBoundsException and ensures that the data is reliable.
 🧠 Explanation of Validationcode != null: prevents error if the variable is null.code.length() == 11:
  ensures it has exactly 11 characters.code.matches("[A-Z0-9]+"):
  ensures that it contains only uppercase letters and digits, as is common in SWIFT codes.
 */
        if (isValidSwiftCode(swiftCode)) {
            String countryCode = swiftCode.substring(4, 6);
            System.out.println("Código do país: " + countryCode);
        } else {
            System.out.println("Código SWIFT inválido!");
        }
    }

    public static boolean isValidSwiftCode(String code) {
        return code != null && code.length() == 11 &&
                code.matches("[A-Z0-9]+");
    }
}
