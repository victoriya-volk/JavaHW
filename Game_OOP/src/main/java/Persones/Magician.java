package Persones;

public abstract class Magician extends Character{
    String name;
    int mana;

    public Magician(float hp, int maxHp, int damage, int attack, int def, int speed, int mana) {
        super(hp, maxHp, damage, attack, def, speed);
        this.mana = mana;
    }
}
