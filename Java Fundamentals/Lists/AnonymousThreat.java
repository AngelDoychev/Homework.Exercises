package Fundametals.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> text = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("3:1")) {
            switch (command[0]) {
                case "merge":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > text.size() - 1) {
                        endIndex = text.size() - 1;
                    }
                    if (startIndex >= 0 && startIndex <= text.size() - 1 && endIndex >= 0 && endIndex <= text.size() - 1) {
                        String newText = "";
                        for (int i = startIndex; i <= endIndex; i++) {
                            newText += text.get(i);
                        }
                        text.subList(startIndex, endIndex + 1).clear();
                        text.add(startIndex, newText);
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int parts = Integer.parseInt(command[2]);
                    if (index >= 0 && index <= text.size() - 1) {
                        String textToDivide = text.get(index);
                        text.remove(index);
                        int length = textToDivide.length() / parts;
                        int beginIndex = 0;
                        for (int i = 1; i < parts; i++) {
                            String textPerPart = textToDivide.substring(beginIndex, beginIndex + length);
                            text.add(index, textPerPart);
                            index++;
                            beginIndex += length;
                        }
                        String textLastParts = textToDivide.substring(beginIndex, textToDivide.length());
                        text.add(index, textLastParts);
                    }

                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        for (String currentText : text) {
            System.out.print(currentText + " ");
        }
    }
}
