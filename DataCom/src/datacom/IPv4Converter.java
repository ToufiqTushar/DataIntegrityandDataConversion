package datacom;

import java.util.Scanner;

public class IPv4Converter {

    // Method to convert a decimal IPv4 address to binary
    public static String decimalToBinary(String ipv4) {
        String[] octets = ipv4.split("\\.");
        StringBuilder binaryIP = new StringBuilder();

        for (String octet : octets) {
            int num = Integer.parseInt(octet);
            String binaryOctet = String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0');
            binaryIP.append(binaryOctet).append(".");
        }

        return binaryIP.toString().substring(0, binaryIP.length() - 1);  // Remove last dot
    }

    // Method to convert a binary IPv4 address to decimal
    public static String binaryToDecimal(String binaryIP) {
        String[] binaryOctets = binaryIP.split("\\.");
        StringBuilder decimalIP = new StringBuilder();

        for (String binaryOctet : binaryOctets) {
            int decimal = Integer.parseInt(binaryOctet, 2);
            decimalIP.append(decimal).append(".");
        }

        return decimalIP.toString().substring(0, decimalIP.length() - 1);  // Remove last dot
    }

    // Method to interact with the user for IPv4 conversion operations
    public static void performIPv4ConversionOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the IPv4 address in Decimal format(Dotted): ");
        String decimalIP = scanner.nextLine();

        String binaryIP = decimalToBinary(decimalIP);
        System.out.println("Binary format: " + binaryIP);

        System.out.print("Enter the IPv4 address in Binary format(Dotted): ");
        String inputBinaryIP = scanner.nextLine();

        String convertedDecimalIP = binaryToDecimal(inputBinaryIP);
        System.out.println("Decimal format: " + convertedDecimalIP);
    }
}
