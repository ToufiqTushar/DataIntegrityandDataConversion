package datacom;

import java.util.Scanner;

public class ParityChecker {

    // Method to calculate the parity bit for a given string
    public static char calculateParityBit(String binaryData) {
        int count = 0;
        for (char bit : binaryData.toCharArray()) {
            if (bit == '1') {
                count++;
            }
        }
        // If count is odd, return '1' (for even parity) and vice versa
        return (count % 2 == 0) ? '0' : '1';
    }

    // Method to check if the data with parity is correct
    public static boolean checkParity(String dataWithParity) {
        return calculateParityBit(dataWithParity.substring(0, dataWithParity.length() - 1)) == dataWithParity.charAt(dataWithParity.length() - 1);
    }

    // Method to interact with the user for parity check operations
    public static void performParityCheckOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary data for parity calculation: ");
        String data = scanner.nextLine();

        char parityBit = calculateParityBit(data);
        System.out.println("Calculated Parity Bit: " + parityBit);

        String dataWithParity = data + parityBit;
        System.out.println("Data with Parity Bit: " + dataWithParity);

        System.out.print("Enter the binary data with parity bit for checking: ");
        String dataToCheck = scanner.nextLine();
        System.out.println("Parity Check: " + (checkParity(dataToCheck) ? "No Error" : "Error Detected"));
    }
}
