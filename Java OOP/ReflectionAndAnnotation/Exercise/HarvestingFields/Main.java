package JavaOOP.Reflection.Exercise.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Class landClass = RichSoilLand.class;
        int num = 0;
        while (num < 100) {
            Field[] fields = landClass.getDeclaredFields();
            switch (command) {
                case "private":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isPrivate(e.getModifiers()))
                            .forEach(e -> System.out.printf("private %s %s%n", e.getType().getSimpleName(), e.getName()));
                    break;
                case "protected":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isProtected(e.getModifiers()))
                            .forEach(e -> System.out.printf("protected %s %s%n", e.getType().getSimpleName(), e.getName()));
                    break;
                case "public":
                    Arrays.stream(fields)
                            .filter(e -> Modifier.isPublic(e.getModifiers()))
                            .forEach(e -> System.out.printf("public %s %s%n", e.getType().getSimpleName(), e.getName()));
                    break;
                case "all":
                    for (Field field : fields) {
                        if (Modifier.isPrivate(field.getModifiers())) {
                            System.out.printf("private %s %s%n", field.getType().getSimpleName(), field.getName());
                        } else if (Modifier.isPublic(field.getModifiers())) {
                            System.out.printf("public %s %s%n", field.getType().getSimpleName(), field.getName());
                        } else if (Modifier.isProtected(field.getModifiers())) {
                            System.out.printf("protected %s %s%n", field.getType().getSimpleName(), field.getName());
                        }
                    }
                    break;
                case "HARVEST":
                    return;
            }
            num++;
            command = scanner.nextLine();
        }
    }
}
