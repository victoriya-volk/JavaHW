package Persones;

public class Spearman extends Warriors {
    public Spearman (String name) {
        super(1, 1, 1, 1, 1, new int[]{1, 3});
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
