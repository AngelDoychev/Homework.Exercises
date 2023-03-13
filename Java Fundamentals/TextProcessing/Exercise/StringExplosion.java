package Fundametals.TextProcessing.Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int leftover = 0;
        String[] array = text.split(">");
        ArrayList<String> textList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            textList.add(array[i]);
        }
        for (int i = 1; i < textList.size(); i++) {
            int explosionRadius = Integer.parseInt(Character.toString(textList.get(i).charAt(0)));
            sb.append(textList.get(i));
            int temp = sb.length();
            sb.replace(0, explosionRadius + leftover, "");
            if (explosionRadius >= temp) {
                leftover = explosionRadius - temp;
            } else {
                leftover = 0;
            }
            textList.set(i, sb.toString());
            sb.delete(0, sb.length());
        }
        for (int i = 0; i < textList.size() - 1; i++) {
            System.out.print(textList.get(i));
            System.out.print(">");
        }
        System.out.println(textList.get(textList.size() - 1));
    }
}
