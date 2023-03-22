package Persones;

public class Sniper extends Archer{

    public Sniper(String name, int posX, int posY) {
        super(15, 12, 10, 15, 9, new int[]{8, 10}, 32, 9);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }

    @Override
    public void step() {

    }
}
