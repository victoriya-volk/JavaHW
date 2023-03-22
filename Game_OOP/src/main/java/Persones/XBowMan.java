package Persones;

public class XBowMan extends Archer {

    public XBowMan(String name, int posX, int posY) {
        super.posX = posX;
        super.posY = posY;
        super(10, 6, 3, 6, 4, new int[]{2, 3}, 16, 4);
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
