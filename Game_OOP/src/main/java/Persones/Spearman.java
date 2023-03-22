package Persones;

public class Spearman extends Warriors {
    public Spearman (String name, int posX, int posY) {
        super(10, 4, 5, 10, 4, new int[]{1, 3});
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}
