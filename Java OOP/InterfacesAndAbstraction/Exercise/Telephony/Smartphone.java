package JavaOOP.IntefacesAndAbstraction.Exercise.Telephony;

import java.util.List;

public class Smartphone implements Browsable, Callable {
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        StringBuilder result = new StringBuilder();
        for (String url : this.urls) {
            boolean isValid = true;
            for (int i = 0; i < url.length(); i++) {
                if (Character.isDigit(url.charAt(i))) {
                    isValid = false;
                }
            }
            if (isValid) {
                result.append("Browsing: ").append(url).append("\n");
            }else {
                result.append("Invalid URL!").append("\n");
            }
        }
        return result.toString().trim();
    }

    @Override
    public String call() {
        StringBuilder result = new StringBuilder();
        for (String number : this.numbers) {
            boolean isValid = true;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isLetter(number.charAt(i))) {
                    isValid = false;
                }
            }
            if (isValid) {
                result.append("Calling... ").append(number).append("!\n");
            }else {
                result.append("Invalid number!").append("\n");
            }
        }
        return result.toString().trim();
    }
}
