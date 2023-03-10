package Persones;

import Persones.Character;

public abstract class Archer extends Character {
    int shots, maxShots;
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int attack, int def, int shots, int maxShots, float dist) {
        super(hp, maxHp, damage, attack, def);
        this.dist = dist;
        this.shots = shots;
        this.maxShots = maxShots;
    }

    public  float getDist() {return dist;};


}
