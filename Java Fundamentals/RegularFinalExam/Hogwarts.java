package Fundametals.RegularFinalExam;

import java.util.Scanner;

public class Hogwarts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");
        StringBuilder spell = new StringBuilder(text);
        while (!command[0].equals("Abracadabra")) {
            switch (command[0]) {
                case "Abjuration":
                    spell = new StringBuilder(spell.toString().toUpperCase());
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    spell = new StringBuilder(spell.toString().toLowerCase());
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(command[1]);
                    String letter = command[2];
                    if (index >= 0 && index < spell.length()) {
                        spell.replace(index, index + 1, letter);
                        System.out.println("Done!");
                    } else {
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = command[1];
                    String secondSubstring = command[2];
                    if (spell.toString().contains(firstSubstring)) {
                        spell = new StringBuilder(spell.toString().replaceAll(firstSubstring, secondSubstring));
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String subString = command[1];
                    if (spell.toString().contains(subString)) {
                        spell = new StringBuilder(spell.toString().replace(subString, ""));
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
