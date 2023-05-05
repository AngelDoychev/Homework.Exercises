package JavaAdvance.DefiningClasses.CarInfo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Car[] carsArr = new Car[n];
        for (int i = 0; i < n; i++) {
            String[] currentCarInfo = scanner.nextLine().split("\\s+");
            String currentBrand = currentCarInfo[0];
            String currentModel = currentCarInfo[1];
            int currentHorsePower = Integer.parseInt(currentCarInfo[2]);
            Car currentCar = new Car();
            currentCar.setBrand(currentBrand);
            currentCar.setModel(currentModel);
            currentCar.setHorsePower(currentHorsePower);
            carsArr[i] = currentCar;
        }
        Arrays.stream(carsArr).forEach(e -> System.out.println(e.carInfo()));
    }
}
