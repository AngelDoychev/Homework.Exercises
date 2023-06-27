package JavaOOP.Inheritance.StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings sos = new StackOfStrings();
        sos.push("One");
        sos.push("Two");
        sos.push("Three");
        System.out.println(sos.isEmpty());
        System.out.println(sos.peek());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
