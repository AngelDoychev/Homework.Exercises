package JavaAdvance.PastExams.PastExam02;

import java.util.Arrays;
import java.util.Scanner;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String[][] matrix = new String[rowsAndCols[0]][rowsAndCols[1]];
        for (int i = 0; i < rowsAndCols[0]; i++) {
            String[] temp = scanner.nextLine().split("\\s+");
            matrix[i] = temp;
        }
        int moves = 0;
        int touchedOpponents = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            boolean flag = false;
            if (touchedOpponents == 3) {
                break;
            }
            switch (command) {
                case "up":
                    for (int i = 0; i < rowsAndCols[0]; i++) {
                        for (int j = 0; j < rowsAndCols[1]; j++) {
                            if (matrix[i][j].equals("B")) {
                                if (i - 1 >= 0) {
                                    if (matrix[i - 1][j].equals("P")) {
                                        touchedOpponents++;
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i - 1][j] = "B";
                                        flag = true;
                                        break;
                                    } else if (matrix[i - 1][j].equals("-")) {
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i - 1][j] = "B";
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "down":
                    for (int i = 0; i < rowsAndCols[0]; i++) {
                        for (int j = 0; j < rowsAndCols[1]; j++) {
                            if (matrix[i][j].equals("B")) {
                                if (i + 1 < rowsAndCols[0]) {
                                    if (matrix[i + 1][j].equals("P")) {
                                        touchedOpponents++;
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i + 1][j] = "B";
                                        flag = true;
                                        break;
                                    } else if (matrix[i + 1][j].equals("-")) {
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i + 1][j] = "B";
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "left":
                    for (int i = 0; i < rowsAndCols[0]; i++) {
                        for (int j = 0; j < rowsAndCols[1]; j++) {
                            if (matrix[i][j].equals("B")) {
                                if (j - 1 >= 0) {
                                    if (matrix[i][j - 1].equals("P")) {
                                        touchedOpponents++;
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i][j - 1] = "B";
                                        flag = true;
                                        break;
                                    } else if (matrix[i][j - 1].equals("-")) {
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i][j - 1] = "B";
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "right":
                    for (int i = 0; i < rowsAndCols[0]; i++) {
                        for (int j = 0; j < rowsAndCols[1]; j++) {
                            if (matrix[i][j].equals("B")) {
                                if (j + 1 < rowsAndCols[1]) {
                                    if (matrix[i][j + 1].equals("P")) {
                                        touchedOpponents++;
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i][j + 1] = "B";
                                        flag = true;
                                        break;
                                    } else if (matrix[i][j + 1].equals("-")) {
                                        moves++;
                                        matrix[i][j] = "-";
                                        matrix[i][j + 1] = "B";
                                        flag = true;
                                        break;
                                    }
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Game over!%nTouched opponents: %d Moves made: %d", touchedOpponents, moves);
    }
}
