package Fundametals.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\|");

        List<String> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            String[] currentArray = arr[i].split("\\s+");

            for (int j = currentArray.length - 1; j >= 0; j--) {
                if (!currentArray[j].equals("")) {
                    list.add(0, currentArray[j]);
                }
            }
        }
        for (String number : list){
            System.out.print(number+" ");
        }
    }
}
