package Persones;

public abstract class Warriors extends Character {
    String name;

    public Warriors(float hp, int maxHp, int damage, int attack, int def) {
        super(hp, maxHp, damage, attack, def);
    }
}
