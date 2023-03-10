package Persones;

public class Sniper extends Archer{

    public Sniper(String name) {
        super(150, 150, 12, 5, 3, 22, 22, 3);
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
