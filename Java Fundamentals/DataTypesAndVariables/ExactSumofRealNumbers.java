package FirstStepsInCoding.Fundamentals.DataTypesAmdVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);
    for (int i = 1; i <=n; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }
        System.out.println(sum);
    }
}
