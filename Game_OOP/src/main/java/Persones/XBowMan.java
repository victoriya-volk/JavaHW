package Persones;

public class XBowMan extends Archer {
    public XBowMan(float hp, int attack, int def, int maxHp, int speed, int[] damage, int shots, float dist, String name) {
        super(hp, attack, def, maxHp, speed, damage, shots, dist);
        super.name = name;
    }

    public XBowMan(String name) {
        super(10, 6, 3, 10, 4, new int[]{2, 3}, 16, 4);
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
