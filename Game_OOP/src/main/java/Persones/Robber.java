package Persones;

public class Robber extends Warriors {
    public Robber(float hp, int maxHp, int damage, int attack, int def, String name) {
        super(hp, maxHp, damage, attack, def);
        super.name = name;
    }

    public Robber(String name) {
        super(150, 150, 12, 5, 3);
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
