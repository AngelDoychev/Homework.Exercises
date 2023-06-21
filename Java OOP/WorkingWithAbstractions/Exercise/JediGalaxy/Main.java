package JavaOOP.WorkingWithAbstraction.Exercise.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        Galaxy galaxy = new Galaxy(rows, cols);
        galaxy.fillGalaxy(rows, cols);
        String command = scanner.nextLine();
        long totalStars = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediInput = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilInput = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowEvil = evilInput[0];
            int colEvil = evilInput[1];
            galaxy.moveEvil(galaxy, rowEvil, colEvil);
            int rowJedi = jediInput[0];
            int colJedi = jediInput[1];
            totalStars = galaxy.moveJedi(galaxy, totalStars, rowJedi, colJedi);
            command = scanner.nextLine();
        }
        System.out.println(totalStars);
    }
}
