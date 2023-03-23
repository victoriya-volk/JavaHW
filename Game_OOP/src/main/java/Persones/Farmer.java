package Persones;

import java.util.ArrayList;

public class Farmer extends Character{
    String name;

    public Farmer(String name, CoordsPers coords) {
        super(coords.posX, coords.posY, 1,1,1,1,3, new int[]{1, 1}, 1);
        this.name = name;
    }

    @Override
    public void step() {

    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {
        System.out.println("Я крестьянин " + name + ". Я сделал ход!");
    }


    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(name)
                .append("\t| ATK:\t").append(attack)
                .append("\t| HP:\t").append(getHp())
                .append(" \t| Arrows: ").append(delivery)
                .append("\t|").append("\t| (X.Y) : ").append(super.coords.posX).append(".").append(super.coords.posY);
    }
}
