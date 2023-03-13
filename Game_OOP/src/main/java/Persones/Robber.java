package Persones;

public class Robber extends Warriors {
    public Robber(float hp, int maxHp, int damage, int attack, int def,int speed, String name) {
        super(hp, maxHp, damage, attack, def, speed);
        super.name = name;
    }

    public Robber(String name) {
        super(150, 150, 12, 8, 3, 2);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

    @Override
    public void step() {

    }
}
