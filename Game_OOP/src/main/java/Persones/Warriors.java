package Persones;

public abstract class Warriors extends Character {
    String name;

    public Warriors(float hp, int attack, int def, int maxHp, int speed, int[] damage) {
        super(hp, attack, def, maxHp, speed, damage);
    }
}
