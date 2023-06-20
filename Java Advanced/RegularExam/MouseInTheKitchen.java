package JavaAdvance.RegularExam;

import java.util.Arrays;
import java.util.Scanner;

public class MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] currentRow = scanner.nextLine().split("");
            matrix[i] = currentRow;
        }
        int lastRow = -1;
        int lastCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("M")) {
                    lastRow = i;
                    lastCol = j;
                }
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("danger")) {
            int checkCheese = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j].equals("M")) {
                        lastRow = i;
                        lastCol = j;
                    } else if (matrix[i][j].equals("C")) {
                        checkCheese++;
                    }
                }
            }
            if (checkCheese == 0) {
                System.out.println("Happy mouse! All the cheese is eaten, good night!");
                for (String[] strings : matrix) {
                    for (String current : strings) {
                        System.out.print(current);
                    }
                    System.out.println();
                }
                return;
            }
            switch (command) {
                case "up":
                    if (!isOutOfBounds(rows, cols, lastRow - 1, lastCol)) {
                        if (makeMove(matrix, lastRow, lastCol, lastRow - 1, lastCol)) {

                        } else {
                            System.out.println("Mouse is trapped!");
                            for (String[] strings : matrix) {
                                for (String current : strings) {
                                    System.out.print(current);
                                }
                                System.out.println();
                            }
                            return;
                        }
                    } else {
                        System.out.println("No more cheese for tonight!");
                        for (String[] strings : matrix) {
                            for (String current : strings) {
                                System.out.print(current);
                            }
                            System.out.println();
                        }
                        return;
                    }
                    break;
                case "down":
                    if (!isOutOfBounds(rows, cols, lastRow + 1, lastCol)) {
                        if (makeMove(matrix, lastRow, lastCol, lastRow + 1, lastCol)) {

                        } else {
                            System.out.println("Mouse is trapped!");
                            for (String[] strings : matrix) {
                                for (String current : strings) {
                                    System.out.print(current);
                                }
                                System.out.println();
                            }
                            return;
                        }
                    } else {
                        System.out.println("No more cheese for tonight!");
                        for (String[] strings : matrix) {
                            for (String current : strings) {
                                System.out.print(current);
                            }
                            System.out.println();
                        }
                        return;
                    }
                    break;
                case "left":
                    if (!isOutOfBounds(rows, cols, lastRow, lastCol - 1)) {
                        if (makeMove(matrix, lastRow, lastCol, lastRow, lastCol - 1)) {

                        } else {
                            System.out.println("Mouse is trapped!");
                            for (String[] strings : matrix) {
                                for (String current : strings) {
                                    System.out.print(current);
                                }
                                System.out.println();
                            }
                            return;
                        }
                    } else {
                        System.out.println("No more cheese for tonight!");
                        for (String[] strings : matrix) {
                            for (String current : strings) {
                                System.out.print(current);
                            }
                            System.out.println();
                        }
                        return;
                    }
                    break;
                case "right":
                    if (!isOutOfBounds(rows, cols, lastRow, lastCol + 1)) {
                        if (makeMove(matrix, lastRow, lastCol, lastRow, lastCol + 1)) {
                        } else {
                            System.out.println("Mouse is trapped!");
                            for (String[] strings : matrix) {
                                for (String current : strings) {
                                    System.out.print(current);
                                }
                                System.out.println();
                            }
                            return;
                        }
                    } else {
                        System.out.println("No more cheese for tonight!");
                        for (String[] strings : matrix) {
                            for (String current : strings) {
                                System.out.print(current);
                            }
                            System.out.println();
                        }
                        return;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Mouse will come back later!");
        for (String[] strings : matrix) {
            for (String current : strings) {
                System.out.print(current);
            }
            System.out.println();
        }
    }

    public static boolean makeMove(String[][] matrix, int lastRow, int lastCol, int targetRow, int targetCol) {
        if (matrix[targetRow][targetCol].equals("C")) {
            matrix[targetRow][targetCol] = "M";
            matrix[lastRow][lastCol] = "*";
        } else if (matrix[targetRow][targetCol].equals("*")) {
            matrix[targetRow][targetCol] = "M";
            matrix[lastRow][lastCol] = "*";
        } else if (matrix[targetRow][targetCol].equals("@")) {
        } else if (matrix[targetRow][targetCol].equals("T")) {
            matrix[targetRow][targetCol] = "M";
            matrix[lastRow][lastCol] = "*";
            return false;
        }
        return true;
    }

    public static boolean isOutOfBounds(int rows, int cols, int targetRow, int targetCol) {
        if (targetRow < 0 || targetRow > rows - 1 || targetCol < 0 || targetCol > cols - 1) {
            return true;
        } else {
            return false;
        }
    }
}
