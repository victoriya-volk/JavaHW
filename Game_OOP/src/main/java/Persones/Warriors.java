package Persones;

import java.util.ArrayList;

public abstract class Warriors extends Character {
    String name;

    public Warriors(int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage, int delivery) {
        super(posX, posY, hp, attack, def, maxHp, speed, damage, delivery);
    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        int index = super.findNearest(secondTeam);

    }

}
