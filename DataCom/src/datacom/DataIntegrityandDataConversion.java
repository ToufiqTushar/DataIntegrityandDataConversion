package datacom;

import java.util.Scanner;

public class DataIntegrityandDataConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nData Integrity and Data Conversion");
            System.out.println("1. Bit Stuffing");
            System.out.println("2. Character Stuffing");
            System.out.println("3. Cyclic Redundancy Check");
            System.out.println("4. Parity Checker");
            System.out.println("5. Hamming Code");
            System.out.println("6. IPv4 Conversion");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    BitStuffing.performBitStuffingOperation();
                    break;
                case 2:
                    CharacterStuffing.performCharacterStuffingOperation();
                    break;
                case 3:
                    CyclicRedundancyCheck.performCRCCheckOperation();
                    break;
                case 4:
                    ParityChecker.performParityCheckOperation();
                    break;
                case 5:
                    HammingCode.performHammingCodeOperation();
                    break;
                case 6:
                    IPv4Converter.performIPv4ConversionOperation();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
