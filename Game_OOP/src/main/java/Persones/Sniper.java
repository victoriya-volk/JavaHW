package Persones;

import java.util.ArrayList;

public class Sniper extends Archer{

    public Sniper(String name, int posX, int posY) {
        super(posX, posY, 15, 12, 10, 15, 9, new int[]{8, 10},0, 32, 9);
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

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я снайпер " + name + ". Я сделал ход!");
    }
}
