package Persones;

public class Spearman extends Warriors {
    public Spearman(float hp, int maxHp, int damage, int attack, int def, String name) {
        super(hp, maxHp, damage, attack, def);
        super.name = name;
    }

    public Spearman (String name) {
        super(1, 1, 1, 1, 1);
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
