package Persones;

public class Spearman extends Warriors {
    public Spearman (String name) {
        super(10, 4, 5, 10, 4, new int[]{1, 3});
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
