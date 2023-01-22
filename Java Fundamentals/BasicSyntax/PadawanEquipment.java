package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());
        int freeBelts = students/6;
        double totalCost = ((students + Math.ceil(students * 0.1)) * (lightsaberPrice)) + (students * robesPrice) + ((students - freeBelts) * beltPrice);
        if (totalCost>budget){
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalCost-budget));
        }else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalCost);
        }
    }
}
