package Persones;

import GameInterface.GameInterface;

public abstract class Character implements GameInterface {

    public void setHp(float hp) {if (hp >= 0) this.hp = hp;}
    public float getHp() {return  hp;}
     private float hp;
    int attack, def, maxHp, speed;
    int[] damage = new int[2];
//    public int getDef(){return def;};


    public Character(float hp, int attack, int def, int maxHp, int speed, int[] damage) {
        this.hp = hp;
        this.attack = attack;
        this.def = def;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {

        return "Я персонаж!";
    }
}
