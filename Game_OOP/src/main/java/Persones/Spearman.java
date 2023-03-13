package Persones;

public class Spearman extends Warriors {
    public Spearman(float hp, int maxHp, int damage, int attack, int def, int speed, String name) {
        super(hp, maxHp, damage, attack, def, speed);
        super.name = name;
    }

    public Spearman (String name) {
        super(1, 1, 1, 1, 1, 1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}
