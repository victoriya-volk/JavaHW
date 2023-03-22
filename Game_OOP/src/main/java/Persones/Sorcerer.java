package Persones;

import java.util.ArrayList;

public class Sorcerer extends Magician{
    public Sorcerer (String name, int posX, int posY) {
        super(posX, posY,30, 17, 12, 30, 9, new int[]{-5, -5}, 1, 1);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я колдун " + name + ". Я сделал ход!");
    }

    @Override
    public String getInfo() {
        return "Я Колдун!";
    }
}
