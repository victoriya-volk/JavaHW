package Persones;

import java.util.ArrayList;

public class Spearman extends Warriors {
    public Spearman (String name, int posX, int posY) {
        super(posX, posY, 10, 4, 5, 10, 4, new int[]{1, 3}, 0);
        super.name = name;
        super.posX = posX;
        super.posY = posY;
    }


    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я копейщик " + name + ". Я сделал ход!");
    }

    @Override
    public String getInfo() {
        return "Я Копейщик!";
    }
}
