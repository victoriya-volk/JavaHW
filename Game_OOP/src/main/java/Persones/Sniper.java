package Persones;

public class Sniper extends Archer{

    public Sniper(String name) {
        super(15, 12, 10, 15, 9, new int[]{8, 10}, 32, 9);
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я снайпер!";
    }

    @Override
    public void step() {

    }
}
