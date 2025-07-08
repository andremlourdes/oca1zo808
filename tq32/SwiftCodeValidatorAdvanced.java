/*
adding custom validation for the bank code and country code within SWIFT.
🧾 Basic rules for validation:Bank (first 4 characters):
 can be compared against a known list of bank codes.Country (5th and 6th characters):
 must be among the valid country codes, as defined in the ISO 3166-1 alpha-2 standard.
 🎯 ExplanationChecks if the code has the right length and follows the alphanumeric pattern.Extracts the bank and country codes
  via substring.Uses sets to validate against known lists.Prints clear and friendly validation messages ✅❌
 */

package tq32;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SwiftCodeValidatorAdvanced {
    // Simplified list of known banks
    static Set<String> validBankCodes = new HashSet<>(Arrays.asList("ICIC", "HSBC", "CITI", "BBVA"));

    // Simplified list of countries (ISO 3166-1 alpha-2)
    static Set<String> validCountryCodes = new HashSet<>(Arrays.asList("IN", "US", "GB", "BR", "FR", "DE", "JP"));

    public static void main(String[] args) {
        String swiftCode = "ICICINBBRT4";

        if (isValidSwiftCode(swiftCode)) {
            String bankCode = swiftCode.substring(0, 4);
            String countryCode = swiftCode.substring(4, 6);

            if (validBankCodes.contains(bankCode)) {
                System.out.println("Banco reconhecido: " + bankCode);
            } else {
                System.out.println("❌ Código de banco desconhecido: " + bankCode);
            }

            if (validCountryCodes.contains(countryCode)) {
                System.out.println("País reconhecido: " + countryCode);
            } else {
                System.out.println("❌ Código de país inválido: " + countryCode);
            }
        } else {
            System.out.println("❌ Código SWIFT inválido!");
        }
    }

    public static boolean isValidSwiftCode(String code) {
        return code != null && code.length() == 11 &&
                code.matches("[A-Z0-9]+");
    }
}
