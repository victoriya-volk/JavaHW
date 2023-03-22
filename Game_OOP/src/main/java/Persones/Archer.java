package Persones;

import java.util.ArrayList;
import java.util.List;

public abstract class Archer extends Character {
    int shots;
    float dist;
    String name;


    public Archer( int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage, int delivery, int shots, float dist) {
        super(posX, posY, hp, attack, def, maxHp, speed, damage, delivery);
        this.shots = shots;
        this.dist = dist;
    }

    public  float getDist() {return dist;};

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        int index = super.findNearest(secondTeam);
        int farmer = super.findFarmers(firstTeam);
        if (shots > 0 && super.getHp() > 0) {
            if (secondTeam.get(index).def - attack > 0) {
                secondTeam.get(index).setHp(secondTeam.get(index).getHp() - damage[0]);
            } else if (secondTeam.get(index).def - attack == 0) {
                secondTeam.get(index).setHp(secondTeam.get(index).getHp() - ((damage[0] + damage[1]) / 2));
            } else {
                secondTeam.get(index).setHp(secondTeam.get(index).getHp() - damage[1]);
            }
            if (farmer > 0) {
                firstTeam.get(farmer).delivery = 0;
                shots += 1;
            } else {
                shots -= 1;
            }

        }
    }


}
