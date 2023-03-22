package Persones;

public class Farmer extends Character{
    int delivery;
    String name;

    public Farmer(String name, int posX, int posY) {
        super(1,1,1,1,3, new int[]{1, 1});
        this.delivery = 1;
        this.name = name;
        super.posX = posX;
        super.posY = posY;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
