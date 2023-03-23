package Persones;

public class XBowMan extends Archer {

    public XBowMan(String name,CoordsPers coords) {
        super(coords.posX, coords.posY,10, 6, 3, 6, 4, new int[]{2, 3},0, 16, 4);
        super.name = name;
    }


    @Override
    public void step() {

    }

    @Override
    public StringBuilder getInfo() {

        StringBuilder builder = new StringBuilder();
        return builder.append("Арбалет: \t").append(XBowMan.super.name)
                .append("\t| ATK:\t").append(XBowMan.super.attack)
                .append("\t| HP:\t").append(XBowMan.super.getHp())
                .append(" \t| Arrows:").append(XBowMan.super.shots)
                .append("\t|").append("\t| (X.Y) : ").append(XBowMan.super.coords.posX).append(".").append(XBowMan.super.coords.posY);
    }
}
