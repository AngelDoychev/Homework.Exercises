package FirstStepsInCoding.Fundamentals.Methods;

import java.util.Scanner;

public class MultiplyEvensbyOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(oddOrEven(num));
    }

    public static int oddOrEven(int num) {
        int odd = 0;
        int even = 0;
        while (Math.abs(num) > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 == 0) {
                even += lastDigit;
            } else {
                odd += lastDigit;
            }
            num /= 10;
        }
        return even * odd;
    }
}
