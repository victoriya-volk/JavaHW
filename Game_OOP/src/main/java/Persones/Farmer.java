package Persones;

public class Farmer extends Character{
    String name;
    public Farmer(float hp, int maxHp, int damage, int attack, int def, int speed, String name) {
        super(hp, maxHp, damage, attack, def,speed);
        this.name = name;
    }

    public Farmer(String name) {
        super(1,1,1,1,1, 1);
        this.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
