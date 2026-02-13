package datacom;

import java.util.Scanner;

public class CyclicRedundancyCheck {

    // Method to compute the CRC code for the given input and divisor
    public static String computeCRC(String input, String divisor) {
        int inputLen = input.length();
        int divisorLen = divisor.length();
        String extendedInput = input + "0".repeat(divisorLen - 1);
        StringBuilder remainder = new StringBuilder(extendedInput);

        for (int i = 0; i < inputLen; i++) {
            if (remainder.charAt(i) == '1') {
                for (int j = 0; j < divisorLen; j++) {
                    remainder.setCharAt(i + j, remainder.charAt(i + j) == divisor.charAt(j) ? '0' : '1');
                }
            }
        }
        return remainder.substring(inputLen);
    }

    // Modified method to check the data using the CRC code
    public static boolean checkData(String data, String dataWithCRC, String divisor) {
        String checkedCRC = computeCRC(dataWithCRC, divisor);
        boolean isErrorFree = checkedCRC.equals("0".repeat(divisor.length() - 1));
        boolean isFirstBitSame = data.charAt(0) == dataWithCRC.charAt(0);
        return isErrorFree && isFirstBitSame;
    }

    // Modified method to interact with the user for CRC operations
    public static void performCRCCheckOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary data: ");
        String data = scanner.nextLine();

        System.out.print("Enter the divisor (binary): ");
        String divisor = scanner.nextLine();

        String crc = computeCRC(data, divisor);
        System.out.println("CRC for the given data: " + crc);

        String dataWithCRC = data + crc;
        System.out.println("Data with CRC: " + dataWithCRC);

        System.out.print("Enter the received data with CRC for checking: ");
        String receivedDataWithCRC = scanner.nextLine();

        System.out.println("Checking data: " + (checkData(data, receivedDataWithCRC, divisor) ? "No Error" : "Error Detected"));
    }
}
