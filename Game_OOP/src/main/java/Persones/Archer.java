package Persones;

public abstract class Archer extends Character {
    int shots;
    float dist;
    String name;

    public Archer(float hp, int attack, int def, int maxHp, int speed, int[] damage, int shots, float dist) {
        super(hp, attack, def, maxHp, speed, damage);
        this.shots = shots;
        this.dist = dist;
    }

//    public Archer(float hp, int maxHp, int[] damage, int attack, int def, int shots, int maxShots, float dist, int speed) {
//        super(hp, maxHp, damage, attack, def, speed);
//        this.dist = dist;
//        this.shots = shots;
//        this.maxShots = maxShots;
//    }

    public  float getDist() {return dist;};


}
