package JavaAdvance.PastExams.PastExam04;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[size][size];
        String number = scanner.nextLine();
        for (int i = 0; i < size; i++) {
            String[] input = scanner.nextLine().split(" ");
            matrix[i] = input;
        }
        String command = scanner.nextLine();
        matrix[0][0] = "RaceCar";
        int kmTraveled = 0;
        while (!command.equals("End")) {
            boolean flag = false;
            switch (command) {
                case "down":
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (matrix[i][j].equals("RaceCar")) {
                                if (matrix[i + 1][j].equals(".")) {
                                    kmTraveled += 10;
                                    matrix[i + 1][j] = "RaceCar";
                                    matrix[i][j] = ".";
                                    flag = true;
                                    break;
                                } else if (matrix[i + 1][j].equals("T")) {
                                    kmTraveled += 30;
                                    matrix[i + 1][j] = ".";
                                    matrix[i][j] = ".";
                                    boolean innerFlag = false;
                                    for (int k = 0; k < size; k++) {
                                        for (int l = 0; l < size; l++) {
                                            if (matrix[k][l].equals("T")) {
                                                matrix[k][l] = "RaceCar";
                                                innerFlag = true;
                                                break;
                                            }
                                        }
                                        if (innerFlag) {
                                            break;
                                        }
                                    }
                                    flag = true;
                                    break;
                                } else if (matrix[i + 1][j].equals("F")) {
                                    kmTraveled += 10;
                                    matrix[i + 1][j] = "C";
                                    matrix[i][j] = ".";
                                    System.out.printf("Racing car %s finished the stage!%n", number);
                                    System.out.printf("Distance covered %d km.%n", kmTraveled);
                                    for (String[] row : matrix) {
                                        for (String col : row) {
                                            System.out.print(col);
                                        }
                                        System.out.println();
                                    }
                                    return;
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "up":
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (matrix[i][j].equals("RaceCar")) {
                                if (matrix[i - 1][j].equals(".")) {
                                    kmTraveled += 10;
                                    matrix[i - 1][j] = "RaceCar";
                                    matrix[i][j] = ".";
                                    flag = true;
                                    break;
                                } else if (matrix[i - 1][j].equals("T")) {
                                    kmTraveled += 30;
                                    matrix[i - 1][j] = ".";
                                    matrix[i][j] = ".";
                                    boolean innerFlag = false;
                                    for (int k = 0; k < size; k++) {
                                        for (int l = 0; l < size; l++) {
                                            if (matrix[k][l].equals("T")) {
                                                matrix[k][l] = "RaceCar";
                                                innerFlag = true;
                                                break;
                                            }
                                        }
                                        if (innerFlag) {
                                            break;
                                        }
                                    }
                                    flag = true;
                                    break;
                                } else if (matrix[i - 1][j].equals("F")) {
                                    kmTraveled += 10;
                                    matrix[i - 1][j] = "C";
                                    matrix[i][j] = ".";
                                    System.out.printf("Racing car %s finished the stage!%n", number);
                                    System.out.printf("Distance covered %d km.%n", kmTraveled);
                                    for (String[] row : matrix) {
                                        for (String col : row) {
                                            System.out.print(col);
                                        }
                                        System.out.println();
                                    }
                                    return;
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "left":
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (matrix[i][j].equals("RaceCar")) {
                                if (matrix[i][j - 1].equals(".")) {
                                    kmTraveled += 10;
                                    matrix[i][j - 1] = "RaceCar";
                                    matrix[i][j] = ".";
                                    flag = true;
                                    break;
                                } else if (matrix[i][j - 1].equals("T")) {
                                    kmTraveled += 30;
                                    matrix[i][j - 1] = ".";
                                    matrix[i][j] = ".";
                                    boolean innerFlag = false;
                                    for (int k = 0; k < size; k++) {
                                        for (int l = 0; l < size; l++) {
                                            if (matrix[k][l].equals("T")) {
                                                matrix[k][l] = "RaceCar";
                                                innerFlag = true;
                                                break;
                                            }
                                        }
                                        if (innerFlag) {
                                            break;
                                        }
                                    }
                                    flag = true;
                                    break;
                                } else if (matrix[i][j - 1].equals("F")) {
                                    kmTraveled += 10;
                                    matrix[i][j - 1] = "C";
                                    matrix[i][j] = ".";
                                    System.out.printf("Racing car %s finished the stage!%n", number);
                                    System.out.printf("Distance covered %d km.%n", kmTraveled);
                                    for (String[] row : matrix) {
                                        for (String col : row) {
                                            System.out.print(col);
                                        }
                                        System.out.println();
                                    }
                                    return;
                                }
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    break;
                case "right":
                    for (int i = 0; i < size; i++) {
                        for (int j = 0; j < size; j++) {
                            if (matrix[i][j].equals("RaceCar")) {
                                if (matrix[i][j + 1].equals(".")) {
                                    kmTraveled += 10;
                                    matrix[i][j + 1] = "RaceCar";
                                    matrix[i][j] = ".";
                                    flag = true;
                                    break;
                                } else if (matrix[i][j + 1].equals("T")) {
                                    kmTraveled += 30;
                                    matrix[i][j + 1] = ".";
                                    matrix[i][j] = ".";
                                    boolean innerFlag = false;
                                    for (int k = 0; k < size; k++) {
                                        for (int l = 0; l < size; l++) {
                                            if (matrix[k][l].equals("T")) {
                                                matrix[k][l] = "RaceCar";
                                                innerFlag = true;
                                                break;
                                            }
                                        }
                                        if (innerFlag) {
                                            break;
                                        }
                                    }
                                    flag = true;
                                    break;
                                } else if (matrix[i][j + 1].equals("F")) {
                                    kmTraveled += 10;
                                    matrix[i][j + 1] = "C";
                                    matrix[i][j] = ".";
                                    System.out.printf("Racing car %s finished the stage!%n", number);
                                    System.out.printf("Distance covered %d km.%n", kmTraveled);
                                    for (String[] row : matrix) {
                                        for (String col : row) {
                                            System.out.print(col);
                                        }
                                        System.out.println();
                                    }
                                    return;
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
        System.out.printf("Racing car %s DNF.%n", number);
        System.out.printf("Distance covered %d km.%n", kmTraveled);
        for (String[] row : matrix) {
            for (String col : row) {
                if (col.equals("RaceCar")) {
                    System.out.print("C");
                } else {
                    System.out.print(col);
                }
            }
            System.out.println();
        }
    }
}
