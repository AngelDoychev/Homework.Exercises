package JavaAdvance.MultidimensionalArrays.Exercise;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rotations = Integer.parseInt(input.replaceAll("[^0-9]", "")) / 90;
        String text = scanner.nextLine();
        int rows = 0;
        int cols = 0;
        int longestCol = Integer.MIN_VALUE;
        ArrayList<String> textList = new ArrayList<>();
        while (!text.equals("END")) {
            textList.add(text);
            if (longestCol < text.length()) {
                longestCol = text.length();
            }
            rows++;
            text = scanner.nextLine();
        }
        cols = longestCol;
        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            char[] currentCharacters = textList.get(i).toCharArray();
            for (int j = 0; j < currentCharacters.length; j++) {
                matrix[i][j] = currentCharacters[j];
            }
        }
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(360);
        queue.offer(90);
        queue.offer(180);
        queue.offer(270);
        while (rotations != 0) {
            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
            rotations--;
        }
        char[][] newMatrix = new char[rows][cols];
        char[][] newMatrixVertical = new char[cols][rows];
        if (!queue.isEmpty()) {
            switch (queue.peek()) {
                case 90:
                    for (int i = 0; i < cols; i++) {
                        int count = rows - 1;
                        for (int j = 0; j < rows; j++) {
                            newMatrixVertical[i][j] = matrix[count][i];
                            count--;
                        }
                    }
                    break;
                case 180:
                    int countRow = -1;
                    for (int i = rows - 1; i >= 0; i--) {
                        int countCol = 0;
                        countRow++;
                        for (int j = cols - 1; j >= 0; j--) {
                            newMatrix[countRow][countCol] = matrix[i][j];
                            countCol++;
                        }
                    }
                    break;
                case 270:
                    for (int i = rows - 1; i >= 0; i--) {
                        int count = 0;
                        for (int j = cols - 1; j >= 0; j--) {
                            newMatrixVertical[j][i] = matrix[i][count];
                            count++;
                        }
                    }
                    break;
                case 360:
                    newMatrix = matrix;
                    break;
            }
            if (queue.peek() == 270 || queue.peek() == 90) {
                for (char[] character : newMatrixVertical) {
                    System.out.println();
                    for (char c : character) {
                        if (c == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(c);
                        }
                    }
                }
            } else if (queue.peek() == 360 || queue.peek() == 180) {
                for (char[] character : newMatrix) {
                    System.out.println();
                    for (char c : character) {
                        if (c == 0) {
                            System.out.print(" ");
                        } else {
                            System.out.print(c);
                        }
                    }
                }
            }
        }
    }
}
