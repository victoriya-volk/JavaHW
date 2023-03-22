package Persones;

public class Robber extends Warriors {

    public Robber(String name, int posX, int posY) {
        super(10, 8, 3, 10, 6, new int[]{2, 4});
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

    @Override
    public void step() {

    }
}
