package JavaAdvance.IteratorsAndComperators.Exercise.ListyIterator;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        ListyIterator<String> current = new ListyIterator<>();
        while (!command[0].equals("END")) {
            switch (command[0]) {
                case "Create":
                    if (command.length>1) {
                        String[] temp = new String[command.length - 1];
                        for (int i = 1; i < command.length; i++) {
                            temp[i-1] = command[i];
                        }
                        current = new ListyIterator<>(temp);
                    }else {
                        current = new ListyIterator<>();
                    }
                    break;
                case "Move":
                        System.out.println(current.next());
                    break;
                case "HasNext":
                    System.out.println(current.hasNext());
                    break;
                case "Print":
                    if (current.getLength()==0){
                        System.out.println("Invalid Operation!");
                    }else {
                        System.out.println(current.getCurrent());
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
