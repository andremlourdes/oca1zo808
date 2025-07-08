package tq32;

import java.util.*;
import java.io.*;

public class SwiftCodeInteractive {
    static Map<String, List<String>> bankCountryMap = new HashMap<>();
    static final String LOG_FILE = "swift_validation_log.txt";

    public static void main(String[] args) {
        carregarDadosFicticios();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SWIFT Code Validator ===");

        while (true) {
            System.out.print("\nEnter the SWIFT code (or 'exit' to finish)): ");
            String swiftCode = scanner.nextLine().trim().toUpperCase();

            if (swiftCode.equals("EXIT")) {
                System.out.println("Shutting down system. 🛑");
                break;
            }

            String resultado = validarSwift(swiftCode);
            System.out.println(resultado);
            salvarLog(swiftCode, resultado);
        }

        scanner.close();
    }

    public static String validarSwift(String swiftCode) {
        if (swiftCode == null || swiftCode.length() != 11 || !swiftCode.matches("[A-Z0-9]+")) {
            return "❌ Formato inválido.";
        }

        String bankCode = swiftCode.substring(0, 4);
        String countryCode = swiftCode.substring(4, 6);

        if (!bankCountryMap.containsKey(bankCode)) {
            return "❌ Unrecognized bank: " + bankCode;
        }

        if (!bankCountryMap.get(bankCode).contains(countryCode)) {
            return "❌ Bank exists, but does not operate in the country: " + countryCode;
        }

        return "✅ SWIFT Valid: BanK " + bankCode + ", Country " + countryCode;
    }

    public static void carregarDadosFicticios() {
        bankCountryMap.put("BRAD", Arrays.asList("BR", "US"));
        bankCountryMap.put("NUBK", Arrays.asList("BR"));
        bankCountryMap.put("BANK", Arrays.asList("GB", "FR"));
        bankCountryMap.put("DEUT", Arrays.asList("DE", "US"));
    }

    public static void salvarLog(String swiftCode, String resultado) {
        try (FileWriter fw = new FileWriter(LOG_FILE, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            String log = new Date() + " - Code: " + swiftCode + " → " + resultado;
            bw.write(log);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("⚠️ Error saving log: " + e.getMessage());
        }
    }
}

