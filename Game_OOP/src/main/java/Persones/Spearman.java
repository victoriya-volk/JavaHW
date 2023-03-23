package Persones;

public class Spearman extends Warriors {
    public Spearman (String name, CoordsPers coords) {
        super(coords.posX, coords.posY, 10, 4, 5, 10, 4, new int[]{1, 3}, 0);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public StringBuilder getInfo() {

        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.getHp())
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }
}
