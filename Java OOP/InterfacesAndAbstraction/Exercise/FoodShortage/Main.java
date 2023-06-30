package JavaOOP.IntefacesAndAbstraction.Exercise.FoodShortage;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> map = new HashMap();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] personInput = scanner.nextLine().split("\\s+");
            if (personInput.length == 4) {
                Citizen currentCitizen = new Citizen(personInput[0], Integer.parseInt(personInput[1]), personInput[2], personInput[3]);
                map.put(personInput[0], currentCitizen);
            } else if (personInput.length == 3) {
                Rebel currentRebel = new Rebel(personInput[0], Integer.parseInt(personInput[1]), personInput[2]);
                map.put(personInput[0], currentRebel);
            }
        }
        String buyer = scanner.nextLine();
        while (!buyer.equals("End")) {
            if (map.containsKey(buyer)) {
                map.get(buyer).buyFood();
            }
            buyer = scanner.nextLine();
        }
        System.out.println(map.values().stream().mapToInt(Buyer::getFood).sum());
    }
}
