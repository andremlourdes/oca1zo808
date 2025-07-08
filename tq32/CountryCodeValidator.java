/*
Let's then explore how to integrate an external API to validate SWIFT codes with real data from banks and countries.
Using APIs makes the system more dynamic and reliable, as you access updated data without relying on local files.
🛰️ Examples of APIs that might be usefulSWIFTRef API -
 (official, but paid)Provides complete data on SWIFT/BIC codes, banks, countries,
  and locations.Open Bank Project APIsPublic API aimed at financial and banking data,
   ideal for testing.ISO 3166 Country Code API (e.g., restcountries.com)To validate country codes in alpha-2 format.
 */

package tq32;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CountryCodeValidator {
    public static boolean isValidCountryCode(String code) {
        try {
            URL url = new URL("https://restcountries.com/v3.1/alpha/" + code);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            return conn.getResponseCode() == 200;
        } catch (Exception e) {
            System.out.println("Error connecting to the API: " + e.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        String countryCode = "BR";
        if (isValidCountryCode(countryCode)) {
            System.out.println("✅ Valid country!");
        } else {
            System.out.println("❌Invalid country code!");
        }
    }
}
