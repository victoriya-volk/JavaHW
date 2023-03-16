package Persones;

public class Monk extends Magician{

    public Monk(String name) {
        super(30, 12, 7,30,5,new int[]{-4, -4},1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я Монах!";
    }
}
