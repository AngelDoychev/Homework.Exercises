package FirstStepsInCoding.Fundamentals.BasicSyntax.MoreExercises;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = Integer.parseInt(scanner.nextLine());
        String newString = "";
        char ch;
        for (int i = 1; i <=index; i++) {
            int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 2:
                ch = 'a';
                newString = newString + ch;
                break;
            case 22:
                ch = 'b';
                newString = newString + ch;
                break;
            case 222:
                ch = 'c';
                newString = newString + ch;
                break;
            case 3:
                ch = 'd';
                newString = newString + ch;
                break;
            case 33:
                ch = 'e';
                newString = newString + ch;
                break;
            case 333:
                ch = 'f';
                newString = newString + ch;
                break;
            case 4:
                ch = 'g';
                newString = newString + ch;
                break;
            case 44:
                ch = 'h';
                newString = newString + ch;
                break;
            case 444:
                ch = 'i';
                newString = newString + ch;
                break;
            case 5:
                ch = 'j';
                newString = newString + ch;
                break;
            case 55:
                ch = 'k';
                newString = newString + ch;
                break;
            case 555:
                ch = 'l';
                newString = newString + ch;
                break;
            case 6:
                ch = 'm';
                newString = newString + ch;
                break;
            case 66:
                ch = 'n';
                newString = newString + ch;
                break;
            case 666:
                ch = 'o';
                newString = newString + ch;
                break;
            case 7:
                ch = 'p';
                newString = newString + ch;
                break;
            case 77:
                ch = 'q';
                newString = newString + ch;
                break;
            case 777:
                ch = 'r';
                newString = newString + ch;
                break;
            case 7777:
                ch = 's';
                newString = newString + ch;
                break;
            case 8:
                ch = 't';
                newString = newString + ch;
                break;
            case 88:
                ch = 'u';
                newString = newString + ch;
                break;
            case 888:
                ch = 'v';
                newString = newString + ch;
                break;
            case 9:
                ch = 'w';
                newString = newString + ch;
                break;
            case 99:
                ch = 'x';
                newString = newString + ch;
                break;
            case 999:
                ch = 'y';
                newString = newString + ch;
                break;
            case 9999:
                ch = 'z';
                newString = newString + ch;
                break;
            case 0:
                ch = ' ';
                newString = newString + ch;
                break;
        }
        }
        System.out.println(newString);
    }
}
