package Persones;

public class Sorcerer extends Magician{
    public Sorcerer (String name, int posX, int posY) {
        super(30, 17, 12, 30, 9, new int[]{-5, -5}, 1);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }
}
