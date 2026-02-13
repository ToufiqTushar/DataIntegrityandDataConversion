package datacom;

import java.util.Scanner;

public class BitStuffing {

    // Method for Bit Stuffing
    public static String stuffBits(String input) {
        StringBuilder stuffed = new StringBuilder();
        int count = 0;

        for (char bit : input.toCharArray()) {
            if (bit == '1') {
                count++;
                stuffed.append(bit);
            } else {
                count = 0;
                stuffed.append(bit);
            }

            if (count == 5) {
                stuffed.append('0');
                count = 0;
            }
        }

        return stuffed.toString();
    }

    // Method for Bit De-stuffing
    public static String deStuffBits(String input) {
        StringBuilder deStuffed = new StringBuilder();
        int count = 0;

        for (char bit : input.toCharArray()) {
            if (bit == '1') {
                count++;
                deStuffed.append(bit);
            } else {
                if (count != 5) {
                    deStuffed.append(bit);
                }
                count = 0;
            }
        }

        return deStuffed.toString();
    }

    // Method to take input and perform Bit Stuffing and De-stuffing
    public static void performBitStuffingOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Bit Stream for Bit Stuffing: ");
        String input = scanner.nextLine();

        String stuffedString = stuffBits(input);
        System.out.println("Bit Stuffed Bit Stream: " + stuffedString);

        String deStuffedString = deStuffBits(stuffedString);
        System.out.println("Bit De-stuffed Bit Stream: " + deStuffedString);
    }
}
