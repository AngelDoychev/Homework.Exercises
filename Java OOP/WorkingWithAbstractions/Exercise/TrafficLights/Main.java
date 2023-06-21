package JavaOOP.WorkingWithAbstraction.Exercise.TrafficLights;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int numberOfChanges = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLights = Arrays.stream(input).map(Color::valueOf).map(TrafficLight::new).collect(Collectors.toList());
        for (int i = 0; i < numberOfChanges; i++) {
            for (TrafficLight current : trafficLights) {
                current.changeColor();
                System.out.print(current.getColor() + " ");
            }
            System.out.println();
        }
    }
}
