package JavaAdvance.DefiningClasses.Exercise.CarSalesman;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEngines = Integer.parseInt(scanner.nextLine());
        List<Engine> engineList = new ArrayList<>();
        List<Car> carsList = new ArrayList<>();
        for (int i = 0; i < numberOfEngines; i++) {
            String[] engineInfo = scanner.nextLine().split("\\s+");
            if (engineInfo.length == 2) {
                Engine currentEngine = new Engine(engineInfo[0], engineInfo[1]);
                engineList.add(currentEngine);
            } else if (engineInfo.length == 3) {
                Engine currentEngine = new Engine(engineInfo[0], engineInfo[1], engineInfo[2]);
                engineList.add(currentEngine);
            } else if (engineInfo.length == 4) {
                Engine currentEngine = new Engine(engineInfo[0], engineInfo[1], engineInfo[2], engineInfo[3]);
                engineList.add(currentEngine);
            }
        }
        int numberOfCars = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            if (carInfo.length == 2) {
                Car currentCar = new Car(carInfo[0], carInfo[1]);
                carsList.add(currentCar);
            } else if (carInfo.length == 3) {
                Car currentCar = new Car(carInfo[0], carInfo[1], carInfo[2]);
                carsList.add(currentCar);
            } else if (carInfo.length == 4) {
                Car currentCar = new Car(carInfo[0], carInfo[1], carInfo[2], carInfo[3]);
                carsList.add(currentCar);
            }
        }
        HashMap<String, Engine> engineMap = new HashMap<>();
        for (Engine current : engineList) {
            if (!engineMap.containsKey(current.getModel())) {
                engineMap.put(current.getModel(), current);
            }
        }
        for (Car current : carsList) {
            System.out.printf("%s:%n", current.getModel());

            if (engineMap.containsKey(current.getEngine())) {
                System.out.printf("%s:%nPower: %s%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s%n",
                        current.getEngine(), engineMap.get(current.getEngine()).getPower(),
                        engineMap.get(current.getEngine()).getDisplacement(),
                        engineMap.get(current.getEngine()).getEfficiency(),
                        current.getWeight(), current.getColor());
            }
        }
    }
}
