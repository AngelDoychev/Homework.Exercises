package JavaOOP.Inheritance.Exercise.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("Beast!")) {
            String[] input = scanner.nextLine().split(" ");
            try {
                switch (command[0]) {
                    case "Cat":
                        String catName = input[0];
                        int catAge = Integer.parseInt(input[1]);
                        String catGender = input[2];
                        Cat currentCat = new Cat(catName, catAge, catGender);
                        System.out.println(currentCat);
                        break;
                    case "Dog":
                        String dogName = input[0];
                        int dogAge = Integer.parseInt(input[1]);
                        String dogGender = input[2];
                        Dog currentDog = new Dog(dogName, dogAge, dogGender);
                        System.out.println(currentDog);
                        break;
                    case "Kitten":
                        String kittenName = input[0];
                        int kittenAge = Integer.parseInt(input[1]);
                        Kitten currentKitten = new Kitten(kittenName, kittenAge);
                        System.out.println(currentKitten);
                        break;
                    case "Tomcat":
                        String tomcatName = input[0];
                        int tomcatAge = Integer.parseInt(input[1]);
                        Tomcat currentTomcat = new Tomcat(tomcatName, tomcatAge);
                        System.out.println(currentTomcat);
                        break;
                    case "Frog":
                        String frogName = input[0];
                        int frogAge = Integer.parseInt(input[1]);
                        String frogGender = input[2];
                        Frog currentFrog = new Frog(frogName, frogAge, frogGender);
                        System.out.println(currentFrog);
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine().split(" ");
        }
    }
}
