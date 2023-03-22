package Persones;

import java.util.ArrayList;

public class Robber extends Warriors {

    public Robber(String name, int posX, int posY) {
        super(posX, posY, 10, 8, 3, 10, 6, new int[]{2, 4}, 0);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }

    @Override
    public String getInfo() {
        return "Я Разбойник!";
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я разбойник " + name + ". Я сделал ход!");
    }
}
