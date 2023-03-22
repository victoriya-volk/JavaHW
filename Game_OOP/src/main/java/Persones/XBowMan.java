package Persones;

import java.util.ArrayList;

public class XBowMan extends Archer {

    public XBowMan(String name, int posX, int posY) {
        super(posX, posY,10, 6, 3, 6, 4, new int[]{2, 3},0, 16, 4);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я арбалетчик " + name + ". Я сделал ход!");
    }

    @Override
    public String getInfo() {
        return "Я Арбалетчик!";
    }
}
