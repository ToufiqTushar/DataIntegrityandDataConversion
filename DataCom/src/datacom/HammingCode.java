package datacom;

import java.util.Scanner;

public class HammingCode {

    // Method to generate Hamming Code for a given binary data
    public static String generateHammingCode(String data) {
        int r = 0;

        // Find the number of redundant bits needed
        while (Math.pow(2, r) < data.length() + r + 1) {
            r++;
        }

        // Create an array to store the Hamming code
        int[] hammingCode = new int[data.length() + r];

        // Initialize positions of redundant bits to -1
        for (int i = 0; i < r; i++) {
            hammingCode[(int)Math.pow(2, i) - 1] = -1;
        }

        // Fill the remaining array with data bits
        int j = 0;
        for (int i = 0; i < hammingCode.length; i++) {
            if (hammingCode[i] != -1) {
                hammingCode[i] = data.charAt(j) - '0';
                j++;
            }
        }

        // Calculate redundant bits values
        for (int i = 0; i < r; i++) {
            int x = (int)Math.pow(2, i);
            int sum = 0;

            for (int k = x; k <= hammingCode.length; k += 2 * x) {
                for (int l = k; (l < k + x) && (l <= hammingCode.length); l++) {
                    if (l - 1 != x - 1) {
                        sum += hammingCode[l - 1];
                    }
                }
            }

            hammingCode[x - 1] = sum % 2;
        }

        // Convert hamming code to string and return
        StringBuilder hammingCodeStr = new StringBuilder();
        for (int i : hammingCode) {
            hammingCodeStr.append(i >= 0 ? i : 0);
        }

        return hammingCodeStr.toString();
    }

    // Method to detect and correct error in Hamming Code
    public static String correctHammingCode(String receivedCode) {
        int r = 0;
        int len = receivedCode.length();

        // Calculate the number of redundant bits
        while (Math.pow(2, r) < len + 1) {
            r++;
        }

        // Convert string to array of integers
        int[] received = new int[len];
        for (int i = 0; i < len; i++) {
            received[i] = receivedCode.charAt(i) - '0';
        }

        // Check for error and find its position
        int errorPos = 0;
        for (int i = 0; i < r; i++) {
            int x = (int)Math.pow(2, i);
            int sum = 0;

            for (int k = x; k <= len; k += 2 * x) {
                for (int l = k; (l < k + x) && (l <= len); l++) {
                    sum += received[l - 1];
                }
            }

            if (sum % 2 != 0) {
                errorPos += x;
            }
        }

        // Correct the error if position is within range
        if (errorPos != 0 && errorPos <= len) {
            received[errorPos - 1] ^= 1;
            System.out.println("Error detected and corrected at position: " + errorPos);
        } else {
            System.out.println("No error detected or error cannot be corrected.");
        }

        // Convert corrected code to string and return
        StringBuilder correctedCodeStr = new StringBuilder();
        for (int i : received) {
            correctedCodeStr.append(i);
        }

        return correctedCodeStr.toString();
    }

    // Method to interact with the user for Hamming Code operations
    public static void performHammingCodeOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary data for Hamming Code generation: ");
        String data = scanner.nextLine();

        String hammingCode = generateHammingCode(data);
        System.out.println("Generated Hamming Code: " + hammingCode);

        System.out.print("Enter received Hamming Code for error checking: ");
        String receivedCode = scanner.nextLine();

        String correctedCode = correctHammingCode(receivedCode);
        System.out.println("Corrected Hamming Code: " + correctedCode);
    }
}
