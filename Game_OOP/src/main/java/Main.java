import Persones.*;
import Persones.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> firstTeam = new ArrayList<>();
        ArrayList<Character> secondTeam = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int bones = new Random().nextInt(1001);
            if (bones >= 1 && bones < 251) {
                firstTeam.add(new XBowMan(getName()));
            } else if (bones >= 251 && bones < 501) {
                firstTeam.add(new Spearman(getName()));
            } else if (bones >= 501 && bones < 751) {
                firstTeam.add(new Monk(getName()));
            } else {
                firstTeam.add(new Farmer(getName()));
            }
        }
        for (int i = 0; i < 10; i++) {
            int bones = new Random().nextInt(1001);
            if (bones >= 1 && bones < 251) {
                secondTeam.add(new Sniper(getName()));
            } else if (bones >= 251 && bones < 501) {
                secondTeam.add(new Robber(getName()));

            } else if (bones >= 501 && bones < 751) {
                    secondTeam.add(new Sorcerer(getName()));
            } else {
                secondTeam.add(new Farmer(getName()));
            }
        }

    }

    private static String getName() {
        String newName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return newName;

    }
}
