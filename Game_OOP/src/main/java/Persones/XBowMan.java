package Persones;

public class XBowMan extends Archer {

    public XBowMan(float hp, int maxHp, int damage, int attack, int def, int shots, int maxShots, float dist, int speed, String name) {
        super(hp, maxHp, damage, attack, def, shots, maxShots, dist, speed);
        super.name = name;
    }
    public XBowMan(String name) {
        super(10, 10, 12, 6, 3, 16, 16, 3, 4);
        super.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}
