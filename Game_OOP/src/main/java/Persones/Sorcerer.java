package Persones;

public class Sorcerer extends Magician{
    public Sorcerer (String name, CoordsPers coords) {
        super(coords.posX, coords.posY,30, 17, 12, 30, 9, new int[]{-5, -5}, 1, 1);
        super.name = name;
    }


    @Override
    public void step() {

    }



    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Sorcerer.super.name)
                .append("\t| ATK:\t").append(Sorcerer.super.attack)
                .append("\t| HP:\t").append(Sorcerer.super.getHp())
                .append(" \t| MP:\t").append(Sorcerer.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Sorcerer.super.coords.posX).append(".").append(Sorcerer.super.coords.posY);
    }
}
