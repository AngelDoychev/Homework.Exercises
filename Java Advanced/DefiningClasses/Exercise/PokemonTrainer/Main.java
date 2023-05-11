package JavaAdvance.DefiningClasses.Exercise.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        List<Trainer> trainerList = new ArrayList<>();
        while (!command[0].equals("Tournament")) {
            String currentName = command[0];
            String currentPokemonName = command[1];
            String currentElement = command[2];
            int currentHealth = Integer.parseInt(command[3]);
            Trainer currentTrainer = new Trainer(currentName, currentPokemonName, currentElement, currentHealth);
            trainerList.add(currentTrainer);
            command = scanner.nextLine().split("\\s+");
        }
        String type = scanner.nextLine();
        while (!type.equals("End")) {
            switch (type) {
                case "Fire":
                    checkIfTrainerGetsBadge("Fire", trainerList);
                    break;
                case "Water":
                    checkIfTrainerGetsBadge("Water", trainerList);
                    break;
                case "Electricity":
                    checkIfTrainerGetsBadge("Electricity", trainerList);
                    break;
            }
            type = scanner.nextLine();
        }
        Map<String, Integer> trainerMapBadges = new LinkedHashMap<>();
        Map<String, Integer> trainerMapPokemon = new HashMap<>();
        for (Trainer e : trainerList) {
            if (!trainerMapBadges.containsKey(e.getName())) {
                trainerMapBadges.put(e.getName(), e.getBadges());
                if (e.getPokemonCollection().get(0).getHealth() > 0) {
                    trainerMapPokemon.put(e.getName(), e.getPokemonCollection().size());
                } else {
                    trainerMapPokemon.put(e.getName(), 0);
                }
            } else {
                trainerMapBadges.put(e.getName(), e.getBadges() + trainerMapBadges.get(e.getName()));
                if (e.getPokemonCollection().get(0).getHealth() > 0) {
                    trainerMapPokemon.put(e.getName(), e.getPokemonCollection().size() + trainerMapPokemon.get(e.getName()));
                } else {
                    trainerMapPokemon.put(e.getName(), 0);
                }

            }
        }
        trainerMapBadges.entrySet().stream().sorted((left, right) -> {
            return right.getValue().compareTo(left.getValue());
        }).forEach(e -> System.out.printf("%s %d %d%n", e.getKey(), e.getValue(), trainerMapPokemon.get(e.getKey())));
    }

    public static void checkIfTrainerGetsBadge(String type, List<Trainer> trainerList) {
        Set<String> hasBadge = new HashSet<>();
        for (Trainer currentTrainer : trainerList) {
            for (Pokemon currentPokemon : currentTrainer.getPokemonCollection()) {
                if (!hasBadge.contains(currentTrainer.getName())) {
                    if (currentPokemon.getElement().equals(type)) {
                        currentTrainer.setBadges();
                        hasBadge.add(currentTrainer.getName());
                    } else {
                        currentPokemon.setHealth();
                    }
                }
            }
        }
    }
}
