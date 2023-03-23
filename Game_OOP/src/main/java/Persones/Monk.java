package Persones;

import java.util.ArrayList;

public class Monk extends Magician{

    public Monk(String name, CoordsPers coords) {
        super(coords.posX, coords.posY,30, 12, 7,30,5, new int[]{-4, -4},1, 1);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я монах " + name + ". Я сделал ход!");
    }

    @Override
    public StringBuilder getInfo() {

        StringBuilder builder = new StringBuilder();
        return builder.append("Монах:  \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.getHp())
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}
