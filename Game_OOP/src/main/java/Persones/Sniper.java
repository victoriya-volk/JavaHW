package Persones;

public class Sniper extends Archer{

    public Sniper(String name, CoordsPers coords) {
        super(coords.posX, coords.posY, 15, 12, 10, 15, 9, new int[]{8, 10},0, 32, 9);
        super.name = name;
    }

    @Override
    public StringBuilder getInfo() {

        StringBuilder builder = new StringBuilder();
        return builder.append("Снайпер:\t").append(Sniper.super.name)
                .append("\t| ATK:\t").append(Sniper.super.attack)
                .append("\t| HP:\t").append(Sniper.super.getHp())
                .append(" \t| Arrows:").append(Sniper.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(Sniper.super.coords.posX).append(".").append(Sniper.super.coords.posY);
    }

    @Override
    public void step() {

    }

}
