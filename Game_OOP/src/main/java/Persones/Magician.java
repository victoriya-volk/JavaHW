package Persones;

public abstract class Magician extends Character{
    String name;
    int mana;

    public Magician(float hp, int attack, int def, int maxHp, int speed, int[] damage, int mana) {
        super(hp, attack, def, maxHp, speed, damage);
        this.mana = mana;
    }
}
