package JavaOOP.Reflection.Exercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("_");
        Class boxClass = BlackBoxInt.class;
        Field privateField = boxClass.getDeclaredField("innerValue");
        privateField.setAccessible(true);
        Constructor<BlackBoxInt> constructor = boxClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt newBox = constructor.newInstance();
        while (!input[0].equals("END")) {
            String command = input[0];
            int value = Integer.parseInt(input[1]);
            Method addMethod = boxClass.getDeclaredMethod(command, int.class);
            addMethod.setAccessible(true);
            addMethod.invoke(newBox, value);
            System.out.println(privateField.get(newBox));
            input = scanner.nextLine().split("_");
        }
    }
}
