package JavaAdvance.PastExams.PastExam02;

import java.util.*;
import java.util.function.ToIntFunction;

public class ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> textileQueue = new ArrayDeque<>();
        Deque<Integer> medicamentStack = new ArrayDeque<>();
        int[] textileValues = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] medicamentValues = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.stream(textileValues).forEach(textileQueue::offer);
        Arrays.stream(medicamentValues).forEach(medicamentStack::push);
        int patch = 0;
        int bandage = 0;
        int medKit = 0;
        while (!textileQueue.isEmpty() && !medicamentStack.isEmpty()) {
            int currentTextile = textileQueue.peek();
            int currentMedicament = medicamentStack.peek();
            int result = currentTextile + currentMedicament;
            if (result == 30) {
                textileQueue.poll();
                medicamentStack.pop();
                patch++;
            } else if (result == 40) {
                textileQueue.poll();
                medicamentStack.pop();
                bandage++;
            } else if (result == 100) {
                textileQueue.poll();
                medicamentStack.pop();
                medKit++;
            } else if (result > 100) {
                textileQueue.poll();
                medicamentStack.pop();
                int temp = medicamentStack.pop() + result - 100;
                medicamentStack.push(temp);
                medKit++;
            } else {
                textileQueue.poll();
                int temp = medicamentStack.pop();
                medicamentStack.push(temp + 10);
            }
        }
        if (textileQueue.isEmpty() && !medicamentStack.isEmpty()) {
            System.out.println("Textiles are empty.");
        } else if (!textileQueue.isEmpty()) {
            System.out.println("Medicaments are empty.");
        } else {
            System.out.println("Textiles and medicaments are both empty.");
        }
        Map<String, Integer> map = new TreeMap<>();
        map.put("MedKit", medKit);
        map.put("Bandage", bandage);
        map.put("Patch", patch);
        map.entrySet().stream().filter(e -> e.getValue() > 0)
                .sorted(Comparator.comparingInt((ToIntFunction<Map.Entry<String, Integer>>)
                        Map.Entry::getValue).reversed().thenComparing(Map.Entry::getKey))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
        if (textileQueue.isEmpty() && !medicamentStack.isEmpty()) {
            List<Integer> list = new ArrayList<>(medicamentStack);
            System.out.print("Medicaments left: ");
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1) {
                    System.out.print(list.get(i) + ", ");
                } else {
                    System.out.println(list.get(i));
                }
            }
        } else if (!textileQueue.isEmpty()) {
            List<Integer> list = new ArrayList<>(textileQueue);
            System.out.print("Textiles left: ");
            for (int i = 0; i < list.size(); i++) {
                if (i != list.size() - 1) {
                    System.out.print(list.get(i) + ", ");
                } else {
                    System.out.println(list.get(i));
                }
            }
        }
    }
}
