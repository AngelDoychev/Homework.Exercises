package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumFact = 0;
        int startNum = number;
       while(number>0){
           int lastDigit = number%10;
           int fact = 1;
           for (int i = 1; i <=lastDigit; i++) {
               fact = fact * i;
           }
           sumFact+=fact;
           number /= 10;
       }
       if (startNum==sumFact){
           System.out.println("yes");
       }else {
           System.out.println("no");
       }
    }
}
