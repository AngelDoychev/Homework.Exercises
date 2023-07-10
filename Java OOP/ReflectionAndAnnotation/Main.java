package JavaOOP.Reflection.HighQualityMistakes;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;
        Field[] fields = reflection.getDeclaredFields();
        Method[] methods = reflection.getDeclaredMethods();
        Arrays.stream(fields)
                .filter(e -> !Modifier.isPrivate(e.getModifiers()))
                .sorted(Comparator.comparing(Field::getName))
                .forEach(e -> System.out.printf("%s must be private!%n", e.getName()));
        Arrays.stream(methods)
                .filter(e -> !Modifier.isPublic(e.getModifiers()))
                .filter(e -> e.getName().startsWith("get") && e.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s have to be public!%n", e.getName()));
        Arrays.stream(methods)
                .filter(e -> !Modifier.isPrivate(e.getModifiers()))
                .filter(e -> e.getName().startsWith("set") && e.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s have to be private!%n", e.getName()));
    }
}