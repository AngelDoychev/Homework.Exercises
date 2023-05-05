package JavaAdvance.DefiningClasses.CarConstructors;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Car[] carsArr = new Car[n];
        for (int i = 0; i < n; i++) {
            String[] currentCarInfo = scanner.nextLine().split("\\s+");
            if (currentCarInfo.length == 1) {
                Car CurrentCar = new Car(currentCarInfo[0]);
                carsArr[i] = CurrentCar;
            } else if (currentCarInfo.length == 3) {
                Car CurrentCar = new Car(currentCarInfo[0], currentCarInfo[1], Integer.parseInt(currentCarInfo[2]));
                carsArr[i] = CurrentCar;
            }
        }
        Arrays.stream(carsArr).forEach(e -> System.out.println(e.carInfo()));
    }
}
