package JavaAdvance.Generics.Exercise.Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] info = scanner.nextLine().split("\\s+");
        Threeuple<String, String, String> first = new Threeuple<>(info[0] + " " + info[1], info[2], info[3]);
        System.out.println(first);
        info = scanner.nextLine().split("\\s+");
        boolean isDrunk = false;
        if (!info[2].equals("not")){
            isDrunk = true;
        }
        Threeuple<String, Integer, Boolean> second = new Threeuple<>(info[0], Integer.parseInt(info[1]), isDrunk);
        System.out.println(second);
        info = scanner.nextLine().split("\\s+");
        Threeuple<String, Double, String> third = new Threeuple<>(info[0], Double.parseDouble(info[1]), info[2]);
        System.out.println(third);
    }
}
