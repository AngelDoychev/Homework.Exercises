package JavaAdvance.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        ArrayDeque<String> urlStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();
        while (!url.equals("Home")) {
            switch (url) {
                case "back":
                    if (urlStack.size() <= 1) {
                        System.out.println("no previous URLs");
                    } else {
                        forwardStack.push(urlStack.pop());
                        System.out.println(urlStack.peek());
                    }
                    break;
                case "forward":
                    if (forwardStack.isEmpty()) {
                        System.out.println("no next URLs");
                    } else {
                        System.out.println(forwardStack.peek());
                        urlStack.push(forwardStack.pop());
                    }
                    break;
                default:
                    forwardStack.clear();
                    urlStack.push(url);
                    System.out.println(urlStack.peek());
                    break;
            }
            url = scanner.nextLine();
        }
    }
}
