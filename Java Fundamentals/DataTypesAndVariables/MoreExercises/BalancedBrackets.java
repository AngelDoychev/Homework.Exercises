package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables.MoreExercises;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int scale = 0;
        boolean order = false;
        for (int i = 0; i < n; i++) {
            String brackets = scanner.nextLine();
            for (int j = 0; j < brackets.length(); j++) {
                if (brackets.charAt(j) == '(') {
                    scale++;
                    order = true;
                }
                if ((brackets.charAt(j) == ')')) {
                    if (order && scale > 0) {
                        scale--;
                    }
                }
            }
        }
        if (scale == 0) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
