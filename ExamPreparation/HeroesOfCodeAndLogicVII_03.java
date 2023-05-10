package ExamPreparation;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();


        LinkedHashMap<String, List<Integer>> heroesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = input.split("\\s+");
            String heroesName = inputArr[0];
            int hitPoints = Integer.parseInt(inputArr[1]);
            int manaPoints = Integer.parseInt(inputArr[2]);

            if (hitPoints <= 100 && manaPoints <= 200) {
                List<Integer> list = new ArrayList<>();
                list.add(hitPoints);
                list.add(manaPoints);
                heroesMap.put(heroesName, list);
            }
            input = scanner.nextLine();
        }

        while (!input.equals("End")) {
            String[] inputArr = input.split("\\s+-\\s+");
            String command = inputArr[0];
            String heroesName = inputArr[1];

            if (command.equals("CastSpell")) {
                int manaPointsNeeded = Integer.parseInt(inputArr[2]);
                String spellName = inputArr[3];
                int currentMana = heroesMap.get(heroesName).get(1);
                if (currentMana > manaPointsNeeded) {
                    currentMana = currentMana - manaPointsNeeded;
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroesName, spellName, currentMana);
                    heroesMap.get(heroesName).remove(1);
                    heroesMap.get(heroesName).add(1, currentMana);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n", heroesName, spellName);
                }
            } else if (command.equals("TakeDamage")) {
                int damage = Integer.parseInt(inputArr[2]);
                String attacker = inputArr[3];
                int currentHp = heroesMap.get(heroesName).get(0);
                int leftHp = currentHp - damage;
                if (leftHp > 0) {
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroesName, damage, attacker, leftHp);
                    heroesMap.get(heroesName).remove(0);
                    heroesMap.get(heroesName).add(0, leftHp);
                } else {
                    System.out.printf("%s has been killed by %s!%n", heroesName, attacker);
                    heroesMap.remove(heroesName);
                }

            } else if (command.equals("Recharge")) {
                int amount = Integer.parseInt(inputArr[2]);
                int currentMp = heroesMap.get(heroesName).get(1);
                int totalMp = currentMp + amount;
                if (totalMp > 200) {
                    totalMp = 200;
                    int diff = 200 - currentMp;
                    System.out.printf("%s recharged for %d MP!%n", heroesName, diff);
                    heroesMap.get(heroesName).remove(1);
                    heroesMap.get(heroesName).add(1, totalMp);
                } else {
                    System.out.printf("%s recharged for %d MP!%n", heroesName, amount);
                    heroesMap.get(heroesName).remove(1);
                    heroesMap.get(heroesName).add(1, totalMp);
                }

            } else if (command.equals("Heal")) {
                int amount = Integer.parseInt(inputArr[2]);
                int currentHp = heroesMap.get(heroesName).get(0);
                int totalHp = currentHp + amount;
                if (totalHp > 100) {
                    totalHp = 100;
                    int diff = 100 - currentHp;
                    System.out.printf("%s healed for %d HP!%n", heroesName, diff);
                    heroesMap.get(heroesName).remove(0);
                    heroesMap.get(heroesName).add(0, totalHp);
                } else {
                    System.out.printf("%s healed for %d HP!%n", heroesName, amount);
                    heroesMap.get(heroesName).remove(0);
                    heroesMap.get(heroesName).add(0, totalHp);
                }
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroesMap.entrySet()) {
            String heroeName = entry.getKey();
            int hp = entry.getValue().get(0);
            int mp = entry.getValue().get(1);

            System.out.println(heroeName);
            System.out.println("  " + "HP: " + hp);
            System.out.println("  " + "MP: " + mp);
        }

    }
}
