package Fundametals.FinalExamPreparation.Exam04;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, Integer> healthPoints = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> manaPoints = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String heroName = input[0];
            int hp = Integer.parseInt(input[1]);
            int mp = Integer.parseInt(input[2]);
            if (hp > 100) {
                hp = 100;
            }
            if (mp > 200) {
                mp = 200;
            }
            healthPoints.put(heroName, hp);
            manaPoints.put(heroName, mp);
        }
        String[] command = scanner.nextLine().split(" - ");
        while (!command[0].equals("End")) {
            switch (command[0]) {
                case "CastSpell":
                    String heroName = command[1];
                    int mpNeeded = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    if (manaPoints.get(heroName) >= mpNeeded) {
                        manaPoints.put(heroName, manaPoints.get(heroName) - mpNeeded);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaPoints.get(heroName));
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    String attackedHero = command[1];
                    int damage = Integer.parseInt(command[2]);
                    String attacker = command[3];
                    healthPoints.put(attackedHero, healthPoints.get(attackedHero) - damage);
                    if (healthPoints.get(attackedHero) > 0) {
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", attackedHero, damage, attacker, healthPoints.get(attackedHero));
                    } else {
                        healthPoints.remove(attackedHero);
                        manaPoints.remove(attackedHero);
                        System.out.printf("%s has been killed by %s!%n", attackedHero, attacker);
                    }
                    break;
                case "Recharge":
                    String rechargedHero = command[1];
                    int rechargeAmount = Integer.parseInt(command[2]);
                    int difference = 200 - manaPoints.get(rechargedHero) - rechargeAmount;
                    manaPoints.put(rechargedHero, manaPoints.get(rechargedHero) + rechargeAmount);
                    if (manaPoints.get(rechargedHero) > 200) {
                        manaPoints.put(rechargedHero, 200);
                        System.out.printf("%s recharged for %d MP!%n", rechargedHero, rechargeAmount + difference);
                    } else {
                        System.out.printf("%s recharged for %d MP!%n", rechargedHero, rechargeAmount);
                    }
                    break;
                case "Heal":
                    String healedHero = command[1];
                    int healAmount = Integer.parseInt(command[2]);
                    int differenceHealing = 100 - healthPoints.get(healedHero) - healAmount;
                    healthPoints.put(healedHero, healthPoints.get(healedHero) + healAmount);
                    if (healthPoints.get(healedHero) > 100) {
                        healthPoints.put(healedHero, 100);
                        System.out.printf("%s healed for %d HP!%n", healedHero, healAmount + differenceHealing);
                    } else {
                        System.out.printf("%s healed for %d HP!%n", healedHero, healAmount);
                    }
                    break;
            }
            command = scanner.nextLine().split(" - ");
        }
        for (Map.Entry<String, Integer> entry : healthPoints.entrySet()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(), entry.getValue(), manaPoints.get(entry.getKey()));
        }
    }
}
