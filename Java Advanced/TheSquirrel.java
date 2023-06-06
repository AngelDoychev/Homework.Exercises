package JavaAdvance.PastExams.PastExam01;

import java.util.Scanner;

public class TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[size][size];
        String[] commands = scanner.nextLine().split(", ");
        int hazelnuts = 0;
        for (int i = 0; i < size; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }
        for (String command : commands) {
            boolean flag = false;
            if (command.equals("left")) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] == 's') {
                            if (j - 1 < 0) {
                                System.out.println("The squirrel is out of the field.");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            if (matrix[i][j - 1] == 'h') {
                                hazelnuts++;
                                if (hazelnuts == 3) {
                                    System.out.println("Good job! You have collected all hazelnuts!");
                                    System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                    return;
                                }
                            } else if (matrix[i][j - 1] == 't') {
                                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            matrix[i][j - 1] = 's';
                            matrix[i][j] = '*';
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            } else if (command.equals("right")) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] == 's') {
                            if (j + 1 > size - 1) {
                                System.out.println("The squirrel is out of the field.");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            if (matrix[i][j + 1] == 'h') {
                                hazelnuts++;
                                if (hazelnuts == 3) {
                                    System.out.println("Good job! You have collected all hazelnuts!");
                                    System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                    return;
                                }
                            } else if (matrix[i][j + 1] == 't') {
                                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            matrix[i][j + 1] = 's';
                            matrix[i][j] = '*';
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            } else if (command.equals("up")) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] == 's') {
                            if (i - 1 < 0) {
                                System.out.println("The squirrel is out of the field.");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            if (matrix[i - 1][j] == 'h') {
                                hazelnuts++;
                                if (hazelnuts == 3) {
                                    System.out.println("Good job! You have collected all hazelnuts!");
                                    System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                    return;
                                }
                            } else if (matrix[i - 1][j] == 't') {
                                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            matrix[i - 1][j] = 's';
                            matrix[i][j] = '*';
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            } else if (command.equals("down")) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        if (matrix[i][j] == 's') {
                            if (i + 1 > size - 1) {
                                System.out.println("The squirrel is out of the field.");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            if (matrix[i + 1][j] == 'h') {
                                hazelnuts++;
                                if (hazelnuts == 3) {
                                    System.out.println("Good job! You have collected all hazelnuts!");
                                    System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                    return;
                                }
                            } else if (matrix[i + 1][j] == 't') {
                                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                                System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
                                return;
                            }
                            matrix[i + 1][j] = 's';
                            matrix[i][j] = '*';
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
        }
        System.out.println("There are more hazelnuts to collect.");
        System.out.printf("Hazelnuts collected: %d%n", hazelnuts);
    }
}
