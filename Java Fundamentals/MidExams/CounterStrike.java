package MidExams;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialPower = Integer.parseInt(scanner.nextLine());
        int wins = 0;
        boolean enoughEnergy = true;
        String command = scanner.nextLine();
        while (!command.equals("End of battle")) {
            int neededPower = Integer.parseInt(command);
            if (initialPower - neededPower < 0) {
                enoughEnergy = false;
                break;
            } else {
                initialPower -= neededPower;
                wins++;

                if (wins % 3 == 0) {
                    initialPower += wins;
                }
            }
            command = scanner.nextLine();
        }
        if (enoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d", wins, initialPower);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", wins, initialPower);
        }
    }
}
