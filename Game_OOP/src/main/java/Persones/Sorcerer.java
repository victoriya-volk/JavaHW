package Persones;

public class Sorcerer extends Magician{
    public Sorcerer (String name) {
        super(1, 1, 1, 1, 1, new int[]{-5, -5}, 1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }
}
