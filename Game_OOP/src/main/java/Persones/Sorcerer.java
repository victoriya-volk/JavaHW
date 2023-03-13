package Persones;

public class Sorcerer extends Magician{
    public Sorcerer(float hp, int maxHp, int damage, int attack, int def, int mana, int speed, String name) {
        super(hp, maxHp, damage, attack, def, mana, speed);
        super.name = name;
    }

    public Sorcerer (String name) {
        super(1, 1, 1, 1, 1, 1, 1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }
}
