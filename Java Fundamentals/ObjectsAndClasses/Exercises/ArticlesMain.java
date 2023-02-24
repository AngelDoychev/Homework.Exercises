package Fundametals.ObjectsAndClasses.Exercises.Articles;

import java.util.Arrays;
import java.util.Scanner;

public class ArticlesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(", ");
        int count = Integer.parseInt(scanner.nextLine());
        Article article = new Article(command[0], command[1], command[2]);
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split(": ");
            switch (input[0]) {
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.rename(input[1]);
                    break;
            }
        }
        System.out.println(article);
    }
}
