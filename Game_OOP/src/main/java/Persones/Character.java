package Persones;

import GameInterface.GameInterface;

public abstract class Character implements GameInterface {
    private static int characterCnt;
    public static int getCharacterCnt() {return characterCnt; }
    public void setHp(float hp) {if (hp >= 0) this.hp = hp;}
    public float getHp() {return  hp;}
     private float hp;
    int damage, attack, def, maxHp, speed;

//    public int getDef(){return def;};


    public Character(float hp, int maxHp, int damage, int attack, int def, int speed) {
        this.hp = hp;
        this.damage = damage;
        this.attack = attack;
        this.def = def;
        this.maxHp = maxHp;
        this.speed = speed;
        characterCnt++;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Я персонаж!";
    }
}
