package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Objects;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String userOriginal = user;
        int count = 0;
        boolean flag = false;
        String password ="";
        char ch ;
        for (int i = 0; i < user.length(); i++) {
            ch = user.charAt(i);
            password = ch + password;
        }
        while(!flag){
            count++;
            if (count>=4){
                System.out.printf("User %s blocked!", userOriginal);
                break;
            }
            user=scanner.nextLine();
            if (Objects.equals(user, password)){
                flag = true;
                System.out.printf("User %s logged in.", userOriginal);
            }else {
                System.out.println("Incorrect password. Try again.");
            }

        }
    }
}
