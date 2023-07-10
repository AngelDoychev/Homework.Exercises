package JavaOOP.Reflection.GettersAndSetters;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class reflection = Reflection.class;
        Method[] methods = reflection.getDeclaredMethods();
        Arrays.stream(methods)
                .filter(e -> e.getName().startsWith("get") && e.getParameterCount() == 0)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s will return %s%n", e.getName(), e.getReturnType()));
        Arrays.stream(methods)
                .filter(e -> e.getName().startsWith("set") && e.getParameterCount() == 1)
                .sorted(Comparator.comparing(Method::getName))
                .forEach(e -> System.out.printf("%s and will set field of %s%n", e.getName(), e.getParameterTypes()[0].getName()));
    }
}
