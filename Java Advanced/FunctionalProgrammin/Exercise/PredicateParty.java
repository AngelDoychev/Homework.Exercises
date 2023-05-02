package JavaAdvance.FunctionalProgramming.Exercise;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Set<String> filters = new HashSet<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Party!")) {
            filters.add(input);
        }

        filters.forEach(filter -> {
            String command = filter.split("\\s+")[0];
            Predicate<String> filterToApply = getPredicate(filter);
            switch (command) {
                case "Remove":
                    guests.removeIf(filterToApply);
                    break;
                case "Double":
                    guests.addAll(guests.stream().filter(filterToApply).collect(Collectors.toList()));
                    break;
            }
        });

        Collections.sort(guests);
        System.out.println(guests.isEmpty() ? "Nobody is going to the party!" :
                String.format("%s are going to the party!", String.join(", ", guests)));
    }

    private static Predicate<String> getPredicate(String filter) {

        String filterType = filter.split("\\s+")[1];
        String parameter = filter.split("\\s+")[2];

        switch (filterType) {
            case "StartsWith":
                return s -> s.startsWith(parameter);
            case "EndsWith":
                return s -> s.endsWith(parameter);
            case "Length":
                return s -> s.length() == Integer.parseInt(parameter);
            default:
                throw new IllegalArgumentException("Unknown condition " + filter);
        }
    }
}
