package Persones;

public abstract class Archer extends Character {
    int shots;
    float dist;
    String name;



//    public Archer(float hp, int attack, int def, int maxHp, int speed, int[] damage, int shots, float dist) {
//        super(hp, attack, def, maxHp, speed, damage);
//        this.shots = shots;
//        this.dist = dist;
//    }

    public Archer(int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage, int shots, float dist) {
        super(posX, posY, hp, attack, def, maxHp, speed, damage);
        this.shots = shots;
        this.dist = dist;
    }

    public  float getDist() {return dist;};


}
