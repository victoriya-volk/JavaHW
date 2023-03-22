package Persones;

public class CoordsPers {
    protected int posX;
    protected int posY;

    public CoordsPers(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public CoordsPers() {
    }

    public double getDist(CoordsPers opponent){
        return Math.sqrt(Math.pow(posX - opponent.posX, 2) + Math.pow(posY - opponent.posY, 2));
    }
}
