package Persones;

public class Monk extends Magician{

    public Monk(String name, int posX, int posY) {
        super(30, 12, 7,30,5, new int[]{-4, -4},1);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Монах!" + name;
    }
}
