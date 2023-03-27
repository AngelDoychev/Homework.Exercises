package Fundametals.FinalExamPreparation.Exam03;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretText = scanner.nextLine();
        String[] command = scanner.nextLine().split(":\\|:");
        StringBuilder editTool = new StringBuilder(secretText);
        while (!command[0].equals("Reveal")) {
            switch (command[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    editTool.insert(index, " ");
                    break;
                case "Reverse":
                    String subString = command[1];
                    if (editTool.toString().contains(subString)) {
                        int index1 = editTool.indexOf(subString);
                        int lastIndex = index1 + subString.length();
                        editTool.replace(index1, lastIndex, "");
                        StringBuilder revereSubString = new StringBuilder(subString);
                        revereSubString.reverse();
                        editTool.append(revereSubString);
                    } else {
                        System.out.println("error");
                        command = scanner.nextLine().split(":\\|:");
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String subStringToReplace = command[1];
                    String replacement = command[2];
                    if (editTool.toString().contains(subStringToReplace)) {
                        editTool = new StringBuilder(editTool.toString().replace(subStringToReplace, replacement));
                    }
                    break;
            }
            System.out.println(editTool);
            command = scanner.nextLine().split(":\\|:");
        }
        System.out.println("You have a new text message: " + editTool);
    }
}
