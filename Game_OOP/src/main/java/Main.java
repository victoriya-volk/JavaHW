import Persones.*;
import Persones.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> firstTeam = new ArrayList<>();
        firstTeam.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });
        ArrayList<Character> secondTeam = new ArrayList<>();
        secondTeam.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o1.getSpeed() - o2.getSpeed();
            }
        });

        for (int i = 0; i < 10; i++) {
            int bones = new Random().nextInt(1001);
            if (bones >= 1 && bones < 251) {
                firstTeam.add(new XBowMan(getName(), i + 1, 1));
            } else if (bones >= 251 && bones < 501) {
                firstTeam.add(new Spearman(getName(), i + 1, 1));
            } else if (bones >= 501 && bones < 751) {
                firstTeam.add(new Monk(getName(), i + 1, 1));
            } else {
                firstTeam.add(new Farmer(getName(), i + 1, 1));
            }
        }
        for (int i = 0; i < 10; i++) {
            int bones = new Random().nextInt(1001);
            if (bones >= 1 && bones < 251) {
                secondTeam.add(new Sniper(getName(), 1, i + 1));
            } else if (bones >= 251 && bones < 501) {
                secondTeam.add(new Robber(getName(), 1, i + 1));

            } else if (bones >= 501 && bones < 751) {
                    secondTeam.add(new Sorcerer(getName(), 1, i + 1));
            } else {
                secondTeam.add(new Farmer(getName(), 1, i + 1));
            }
        }
        ArrayList<Character> allCharacters = new ArrayList<>(firstTeam);
        allCharacters.addAll(secondTeam);
        allCharacters.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.getSpeed() - o1.getSpeed();
            }
        });


        for (int i = 0; i < allCharacters.size(); i++) {
            System.out.println(allCharacters.get(i).getInfo() + " " + allCharacters.get(i).getSpeed() +
                    " " + allCharacters.get(i).getAttack());
        }

    }

    private static String getName() {
        String newName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return newName;

    }
}
