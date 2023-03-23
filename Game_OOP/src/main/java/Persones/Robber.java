package Persones;

import java.util.ArrayList;

public class Robber extends Warriors {

    public Robber(String name, CoordsPers coords) {
        super(coords.posX, coords.posY, 10, 8, 3, 10, 6, new int[]{2, 4}, 0);
        super.name = name;
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Разбойник: \t").append(Robber.super.name)
                .append("\t| ATK:\t").append(Robber.super.attack)
                .append("\t| HP:\t").append(Robber.super.getHp())
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Robber.super.coords.posX).append(".").append(Robber.super.coords.posY);
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я разбойник " + name + ". Я сделал ход!");
    }
}
