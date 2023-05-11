package JavaAdvance.DefiningClasses.Exercise.RawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            Car currentCar = new Car(command[0], Integer.parseInt(command[1]),
                    Integer.parseInt(command[2]), Integer.parseInt(command[3]), command[4],
                    Double.parseDouble(command[5]), Integer.parseInt(command[6]),
                    Double.parseDouble(command[7]), Integer.parseInt(command[8]),
                    Double.parseDouble(command[9]), Integer.parseInt(command[10]),
                    Double.parseDouble(command[11]), Integer.parseInt(command[12]));
            carList.add(currentCar);
        }
        String type = scanner.nextLine();
        switch (type) {
            case "fragile":
                for (Car current : carList) {
                    double min = (Arrays.stream(current.getTirePressure()).min()).orElse(0);
                    if (min < 1) {
                        System.out.println(current.getModel());
                    }
                }
                break;
            case "flamable":
                for (Car current : carList) {
                    if (current.getEnginePower() > 250) {
                        System.out.println(current.getModel());
                    }
                }
                break;
        }
    }
}
