package JavaAdvance.DefiningClasses.Exercise.Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\\s+");
        Map<String, Company> companyMap = new HashMap<>();
        Map<String, List<Pokemon>> pokemonMap = new HashMap<>();
        Map<String, List<Parents>> parentsMap = new HashMap<>();
        Map<String, List<Children>> childrenMap = new HashMap<>();
        Map<String, Car> carMap = new HashMap<>();
        while (!command[0].equals("End")) {
            String currentName = command[0];
            switch (command[1]) {
                case "company":
                    String companyName = command[2];
                    String department = command[3];
                    double salary = Double.parseDouble(command[4]);
                    Company currentCompany = new Company();
                    currentCompany.setName(companyName);
                    currentCompany.setDepartment(department);
                    currentCompany.setSalary(salary);
                    companyMap.put(currentName, currentCompany);
                    break;
                case "pokemon":
                    String pokemonName = command[2];
                    String pokemonType = command[3];
                    Pokemon currentPokemon = new Pokemon();
                    currentPokemon.setName(pokemonName);
                    currentPokemon.setType(pokemonType);
                    if (!pokemonMap.containsKey(currentName)) {
                        pokemonMap.put(currentName, new ArrayList<>());
                        pokemonMap.get(currentName).add(currentPokemon);
                    } else {
                        pokemonMap.get(currentName).add(currentPokemon);
                    }
                    break;
                case "parents":
                    String parentName = command[2];
                    String parentBirthday = command[3];
                    Parents currentParents = new Parents();
                    currentParents.setName(parentName);
                    currentParents.setBirthday(parentBirthday);
                    if (!parentsMap.containsKey(currentName)) {
                        parentsMap.put(currentName, new ArrayList<>());
                        parentsMap.get(currentName).add(currentParents);
                    } else {
                        parentsMap.get(currentName).add(currentParents);
                    }
                    break;
                case "children":
                    String childName = command[2];
                    String childBirthday = command[3];
                    Children currentChildren = new Children();
                    currentChildren.setName(childName);
                    currentChildren.setBirthday(childBirthday);
                    if (!childrenMap.containsKey(currentName)) {
                        childrenMap.put(currentName, new ArrayList<>());
                        childrenMap.get(currentName).add(currentChildren);
                    } else {
                        childrenMap.get(currentName).add(currentChildren);
                    }
                    break;
                case "car":
                    String carModel = command[2];
                    String carSpeed = command[3];
                    Car currentCar = new Car();
                    currentCar.setModel(carModel);
                    currentCar.setSpeed(carSpeed);
                    carMap.put(currentName, currentCar);
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        String personNeeded = scanner.nextLine();
        System.out.println(personNeeded);
        if (!companyMap.containsKey(personNeeded)) {
            System.out.println("Company:");
        } else {
            System.out.println(companyMap.get(personNeeded));
        }
        if (!carMap.containsKey(personNeeded)) {
            System.out.println("Car:");
        } else {
            System.out.println(carMap.get(personNeeded));
        }
        if (!pokemonMap.containsKey(personNeeded)) {
            System.out.println("Pokemon:");
        } else {
            System.out.println("Pokemon:");
            for (Pokemon current : pokemonMap.get(personNeeded)) {
                System.out.println(current);
            }
        }
        if (!parentsMap.containsKey(personNeeded)) {
            System.out.println("Parents:");
        } else {
            System.out.println("Parents:");
            for (Parents current : parentsMap.get(personNeeded)) {
                System.out.println(current);
            }
        }
        if (!childrenMap.containsKey(personNeeded)) {
            System.out.println("Children:");
        } else {
            System.out.println("Children:");
            for (Children current : childrenMap.get(personNeeded)) {
                System.out.println(current);
            }
        }
        System.out.println();
    }
}
