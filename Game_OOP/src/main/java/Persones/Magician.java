package Persones;

import java.util.ArrayList;

public abstract class Magician extends Character{
    String name;
    int mana;

    public Magician(int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage, int delivery, int mana) {
        super(posX, posY, hp, attack, def, maxHp, speed, damage, delivery);
        this.mana = mana;
    }
    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        int index = super.findNearest(firstTeam);
        System.out.println();
    }
}
