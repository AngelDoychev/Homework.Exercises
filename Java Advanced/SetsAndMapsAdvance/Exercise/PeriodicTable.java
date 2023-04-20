package JavaAdvance.SetsAndMapsAdvanced.Exercise;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] currentElement = scanner.nextLine().split("\\s+");
            Collections.addAll(set, currentElement);
        }
        for (String element : set) {
            System.out.print(element + " ");
        }
    }
}
