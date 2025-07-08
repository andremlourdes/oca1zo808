/*
We love to build a simple Java prototype to simulate the validation of SWIFT codes locally,
using fictional data stored in memory 🧠—without relying on external APIs or files.
🧪 Prototype ObjectiveValidate whether the SWIFT code follows the correct formatCheck
 if the bank code and the country code are present in fictional listsSimulate a "positive" or "negative" response depending on the data.
 🧠 Simulated BehaviorIf swiftCode = "BRADBRXXXX1" → ✅ validIf swiftCode = "BANKBRABCD2" →
  ❌ country BR not compatible with bank BANKIf swiftCode = "XXXXINQQQ1" →
  ❌ unknown bankIf the code has less than 11 characters or invalid characters → ❌ invalid
 */

package tq32;

import java.util.*;

public class SwiftCodePrototype {
    static Map<String, List<String>> bankCountryMap = new HashMap<>();

    public static void main(String[] args) {
        carregarDadosFicticios();

        String swiftCode = "BRADBRXXXX1";  // Exemplo fictício

        if (isValidSwiftCode(swiftCode)) {
            String bankCode = swiftCode.substring(0, 4);
            String countryCode = swiftCode.substring(4, 6);

            if (bankCountryMap.containsKey(bankCode)) {
                List<String> validCountries = bankCountryMap.get(bankCode);
                if (validCountries.contains(countryCode)) {
                    System.out.println("✅ SWIFT válido: banco e país reconhecidos.");
                } else {
                    System.out.println("❌ Banco existe, mas não opera nesse país: " + countryCode);
                }
            } else {
                System.out.println("❌ Código de banco não reconhecido: " + bankCode);
            }
        } else {
            System.out.println("❌ Formato de código SWIFT inválido.");
        }
    }

    public static boolean isValidSwiftCode(String code) {
        return code != null && code.length() == 11 && code.matches("[A-Z0-9]+");
    }

    public static void carregarDadosFicticios() {
        bankCountryMap.put("BRAD", Arrays.asList("BR", "US")); // Banco fictício BRAD opera no Brasil e EUA
        bankCountryMap.put("NUBK", Arrays.asList("BR"));       // Nubank fictício só no Brasil
        bankCountryMap.put("BANK", Arrays.asList("GB", "FR")); // Banco BANK fictício na Grã-Bretanha e França
        bankCountryMap.put("DEUT", Arrays.asList("DE", "US")); // Deutsche fictício na Alemanha e EUA
    }
}

