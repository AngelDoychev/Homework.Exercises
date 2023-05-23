package JavaAdvance.Generics.JarOfT;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> myJar = new Jar<>();
        myJar.add(12);
        myJar.add(12);
        myJar.add(12);
        myJar.remove();
        System.out.println(myJar.remove());
        Jar<String> myNewJar = new Jar<>();
        myNewJar.add("12");
        myNewJar.add("12");
        myNewJar.add("12");
        myNewJar.remove();
        System.out.println(myNewJar.remove());
    }
}
