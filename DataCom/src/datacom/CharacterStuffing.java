package datacom;

import java.util.Scanner;

public class CharacterStuffing {

    private static final String ESC = "ESC";
    private static final String FLAG = "FLAG";

    public static String stuffCharacters(String input) {
        return input.replaceAll(FLAG, ESC + FLAG);
    }

    public static String deStuffCharacters(String input) {
        return input.replaceAll(ESC + FLAG, FLAG);
    }

    public static void performCharacterStuffingOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string for Character Stuffing: ");
        String input = scanner.nextLine();

        String stuffedString = stuffCharacters(input);
        System.out.println("Character Stuffed String: " + stuffedString);

        String deStuffedString = deStuffCharacters(stuffedString);
        System.out.println("Character De-stuffed String: " + deStuffedString);
    }

    public static void main(String[] args) {
        performCharacterStuffingOperation();
    }
}

