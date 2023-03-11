package Fundametals.TextProcessing.Exercise;

import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        StringBuilder product = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int lastDigitProduct = 0;
        String lastNum1 = "";
        String lastNum2 = "";
        int count = num1.length();
        int leftOver = 0;
        for (int i = 0; i < count - 1; i++) {
            if (i != 0) {
                leftOver = ((Integer.parseInt(lastNum1) * Integer.parseInt(lastNum2)) + leftOver) / 10;
            }
            lastNum1 = Character.toString(num1.charAt(num1.length() - 1));
            lastNum2 = Character.toString(num2.charAt(num2.length() - 1));


            lastDigitProduct = ((Integer.parseInt(lastNum1) * Integer.parseInt(lastNum2)) + leftOver) % 10;
            product.append(lastDigitProduct);
            num1 = num1.substring(0, num1.length() - 1);
        }
        leftOver = ((Integer.parseInt(lastNum1) * Integer.parseInt(lastNum2)) + leftOver) / 10;
        lastNum1 = Character.toString(num1.charAt(num1.length() - 1));
        lastNum2 = Character.toString(num2.charAt(num2.length() - 1));
        lastDigitProduct = ((Integer.parseInt(lastNum1) * Integer.parseInt(lastNum2)) + leftOver);
        temp.append(lastDigitProduct);
        temp.reverse();
        product.append(temp);
        System.out.println(product.reverse());
    }
}
