import Persones.*;
import Persones.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Character> persones = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int bones = new Random().nextInt(1001);
            if (bones >= 1 && bones < 301) {
                if (bones < 151) {
                    persones.add(new XBowMan(getName()));
                }
                else {
                    persones.add(new Sniper(getName()));
                }
            } else if (bones >= 301 && bones < 601) {
                if (bones < 551) {
                    persones.add(new Robber(getName()));
                }
                else {
                    persones.add(new Spearman(getName()));
                }
            } else if (bones >= 601 && bones < 901) {
                if(bones < 751) {
                    persones.add(new Monk(getName()));
                }
                else {
                    persones.add(new Sorcerer(getName()));
                }
            } else {
                persones.add(new Farmer(getName()));
            }
        }

        for (int i = 0; i < persones.size(); i++) {
            System.out.println(persones.get(i).getInfo());
        }


    }

    private static String getName() {
        String newName = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return newName;

    }
}
