package Persones;

public class Monk extends Magician{
    public Monk(float hp, int maxHp, int damage, int attack, int def, int mana,int speed) {
        super(hp, maxHp, damage, attack, def, mana,speed);
    }

    public Monk(String name) {
        super(1, 1, 1,1,1,1,10);
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
