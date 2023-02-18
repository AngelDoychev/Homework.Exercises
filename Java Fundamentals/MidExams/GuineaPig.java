package MidExams;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = Double.parseDouble(scanner.nextLine()) * 1000;
        double hay = Double.parseDouble(scanner.nextLine()) * 1000;
        double cover = Double.parseDouble(scanner.nextLine()) * 1000;
        double weightOfGPig = Double.parseDouble(scanner.nextLine()) * 1000;
        for (int i = 1; i <= 30; i++) {
            food -= 300;
            if (i % 2 == 0) {
                hay -= food * 0.05;
            }
            if (i % 3 == 0) {
                cover -= weightOfGPig / 3;
            }
            if (food <= 0 || hay <= 0 || cover <= 0) {
                break;
            }
        }
        if (food <= 0 || hay <= 0 || cover <= 0) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food / 1000, hay / 1000, cover / 1000);
        }
    }
}
