package Persones;

public class XBowMan extends Archer {

    public XBowMan(float hp, int maxHp, int damage, int attack, int def, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, attack, def, shots, maxShots, dist);
        super.name = name;
    }
    public XBowMan(String name) {
        super(150, 150, 12, 5, 3, 22, 22, 3);
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
