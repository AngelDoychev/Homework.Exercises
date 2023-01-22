package FirstStepsInCoding.Fundamentals.BasicSyntax;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalprice = 0;
        switch (type){
            case"Students":
switch(day){
    case"Friday":
        price = 8.45;
        totalprice = price * count;
        break;
    case"Saturday":
        price = 9.80;
        totalprice = price * count;
        break;
    case"Sunday":
        price = 10.46;
        totalprice = price * count;
        break;
}
                if (count>=30){
                    totalprice *=0.85;
                }
                break;
            case"Business":
                if (count>=100){
                    count-=10;
                }
                switch(day){
                    case"Friday":
                        price = 10.90;
                        totalprice = price * count;
                        break;
                    case"Saturday":
                        price = 15.60;
                        totalprice = price * count;
                        break;
                    case"Sunday":
                        price = 16;
                        totalprice = price * count;
                        break;
                }
                break;
            case"Regular":
                switch(day){
                    case"Friday":
                        price = 15;
                        totalprice = price * count;
                        break;
                    case"Saturday":
                        price = 20;
                        totalprice = price * count;
                        break;
                    case"Sunday":
                        price = 22.50;
                        totalprice = price * count;
                        break;
                }
                if (count>=10&&count<=20){
                    totalprice*=0.95;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalprice);
    }
}
