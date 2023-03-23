import Persones.*;
import Persones.Character;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
public class Main {
    static final int UNITS = 10;
    public static ArrayList<Character> holyTeam = new ArrayList<>();
    public static ArrayList<Character> darkTeam = new ArrayList<>();
    public static ArrayList<Character> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.print("Press Enter to begin.");
        createTeam(holyTeam, 0, 1);
        createTeam(darkTeam, 3, 10);
        allTeam.addAll(holyTeam);
        allTeam.addAll(darkTeam);
        sortTeam(allTeam);

        System.out.println(holyTeam.get(0).toString());


        while (true){
            View.view();
            user_input.nextLine();
            for (Character human: allTeam) {
                if (holyTeam.contains(human)) human.step(holyTeam, darkTeam);
                else human.step(darkTeam, holyTeam);
            }
        }

    }
    static void createTeam (ArrayList team, int offset, int posY) {
        for (int i = 0; i < UNITS; i++) {
            int rnd = new Random().nextInt(4)+offset;
            switch (rnd) {
                case (0):
                    team.add(new Sniper(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (1):
                    team.add(new Robber(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (2):
                    team.add(new Sorcerer(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (3):
                    team.add(new Farmer(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (4):
                    team.add(new XBowMan(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (5):
                    team.add(new Monk(getName(), new CoordsPers(i + 1, posY)));
                    break;
                case (6):
                    team.add(new Spearman(getName(), new CoordsPers(i + 1, posY)));
                    break;
            }
        }
    }
    static void sortTeam (ArrayList<Character> team){
        team.sort(new Comparator<Character>() {
            @Override
            public int compare(Character t0, Character t1) {
                if (t1.getSpeed() == t0.getSpeed()) return (int) (t1.getHp() - t0.getHp());
                else  return (int) (t1.getSpeed() - t0.getSpeed());
            }
        });
    }
    static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
