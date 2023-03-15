package Persones;

public class Farmer extends Character{
    int delivery;
    String name;

    public Farmer(float hp, int attack, int def, int maxHp, int speed, int[] damage, int delivery, String name) {
        super(hp, attack, def, maxHp, speed, damage);
        this.delivery = delivery;
        this.name = name;
    }

    public Farmer(String name) {
        super(1,1,1,1,3, new int[]{1, 1});
        this.delivery = 1;
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
