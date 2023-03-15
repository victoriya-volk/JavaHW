package Persones;

public class Monk extends Magician{

    public Monk(String name) {
        super(1, 1, 1,1,1,new int[]{-4, -4},10);
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
