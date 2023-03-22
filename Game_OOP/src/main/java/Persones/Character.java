package Persones;

import GameInterface.GameInterface;

public abstract class Character extends CoordsPers implements GameInterface {



    public int getSpeed(){
        return speed;
    }

    public int getAttack() {
        return attack;
    }

    public void setHp(float hp) {if (hp >= 0) this.hp = hp;}
    public float getHp() {return  hp;}
     private float hp;
    int attack, def, maxHp, speed;
    int[] damage = new int[2];
    protected CoordsPers coords;
//    public int getDef(){return def;};


    public Character(int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage) {
        coords = new CoordsPers(posX, posY);
        this.hp = hp;
        this.attack = attack;
        this.def = def;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
    }

//    public Character(float hp, int posX, int posY, int maxHp, int speed, int[] damage) {
//        super(posX, posY);
//    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {

        return "Я персонаж!";
    }

}
