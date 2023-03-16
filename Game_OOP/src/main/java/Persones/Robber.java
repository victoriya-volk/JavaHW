package Persones;

public class Robber extends Warriors {

    public Robber(String name) {
        super(10, 8, 3, 10, 6, new int[]{2, 4});
        super.name = name;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

    @Override
    public void step() {

    }
}
