package Persones;

public class Monk extends Magician{
    public Monk(float hp, int maxHp, int damage, int attack, int def, int mana) {
        super(hp, maxHp, damage, attack, def, mana);
    }

    public Monk(String name) {
        super(1, 1, 1,1,1,1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }
}
