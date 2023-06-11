package JavaAdvance.PastExams.PastExam03;

import java.util.Scanner;

public class NavyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            String[] temp = scanner.nextLine().split("");
            matrix[i] = temp;
        }
        int lives = 3;
        int cruisersHit = 0;
        int lastRow = -1;
        int lastCol = -1;
        while (lives > 0 && cruisersHit < 3) {
            String command = scanner.nextLine();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (matrix[i][j].equals("S")) {
                        switch (command) {
                            case "up":
                                if (matrix[i - 1][j].equals("*")) {
                                    lives--;
                                    matrix[i - 1][j] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i - 1;
                                    lastCol = j;
                                } else if (matrix[i - 1][j].equals("C")) {
                                    cruisersHit++;
                                    matrix[i - 1][j] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i - 1;
                                    lastCol = j;
                                } else {
                                    matrix[i - 1][j] = "S";
                                    matrix[i][j] = "-";
                                }
                                break;
                            case "down":
                                if (matrix[i + 1][j].equals("*")) {
                                    lives--;
                                    matrix[i + 1][j] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i + 1;
                                    lastCol = j;
                                } else if (matrix[i + 1][j].equals("C")) {
                                    cruisersHit++;
                                    matrix[i + 1][j] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i + 1;
                                    lastCol = j;
                                } else {
                                    matrix[i + 1][j] = "S";
                                    matrix[i][j] = "-";
                                }
                                break;
                            case "left":
                                if (matrix[i][j - 1].equals("*")) {
                                    lives--;
                                    matrix[i][j - 1] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i;
                                    lastCol = j - 1;
                                } else if (matrix[i][j - 1].equals("C")) {
                                    cruisersHit++;
                                    matrix[i][j - 1] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i;
                                    lastCol = j - 1;
                                } else {
                                    matrix[i][j - 1] = "S";
                                    matrix[i][j] = "-";

                                }
                                break;
                            case "right":
                                if (matrix[i][j + 1].equals("*")) {
                                    lives--;
                                    matrix[i][j + 1] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i;
                                    lastCol = j + 1;
                                } else if (matrix[i][j + 1].equals("C")) {
                                    cruisersHit++;
                                    matrix[i][j + 1] = "S";
                                    matrix[i][j] = "-";
                                    lastRow = i;
                                    lastCol = j + 1;
                                } else {
                                    matrix[i][j + 1] = "S";
                                    matrix[i][j] = "-";
                                }
                                break;
                        }
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        if (cruisersHit == 3) {
            System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
            for (String[] rows : matrix) {
                for (String cols : rows) {
                    System.out.print(cols);
                }
                System.out.println();
            }
        } else {
            System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", lastRow, lastCol);
            for (String[] rows : matrix) {
                for (String cols : rows) {
                    System.out.print(cols);
                }
                System.out.println();
            }
        }
    }
}
