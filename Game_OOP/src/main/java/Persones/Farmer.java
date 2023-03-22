package Persones;

import java.util.ArrayList;

public class Farmer extends Character{
    String name;

    public Farmer(String name, int posX, int posY) {
        super(posX, posY, 1,1,1,1,3, new int[]{1, 1}, 1);
        this.name = name;
        super.posX = posX;
        super.posY = posY;
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я крестьянин " + name + ". Я сделал ход!");
    }


    @Override
    public String getInfo() {
        return "Я Крестьянин!";
    }
}
