package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursGiven = Integer.parseInt(scanner.nextLine());
        int minutesGiven = Integer.parseInt(scanner.nextLine());
        int newTime = hoursGiven * 60 + minutesGiven + 30;
        int hours = newTime/60;
        int minutes = newTime%60;
        if (hours>23){
            hours = 0;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
