package Persones;

import GameInterface.GameInterface;

import java.util.ArrayList;
import java.util.List;

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
    int attack, def, maxHp, speed, delivery;
    int[] damage = new int[2];
    protected CoordsPers coords;

    public CoordsPers getCoords() {
        return coords;
    }

    public Character(int posX, int posY, float hp, int attack, int def, int maxHp, int speed, int[] damage, int delivery) {
        coords = new CoordsPers(posX, posY);
        this.hp = hp;
        this.attack = attack;
        this.def = def;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
        this.delivery = delivery;
    }

    @Override
    public void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam) {

    }

    public int findNearest(ArrayList<Character> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDist(team.get(i).coords)){
                index = i;
                min = coords.getDist(team.get(i).coords);
            }
        }
        return index;
    }

    public int findFarmers(ArrayList<Character> team) {
        int farmerIndex;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getInfo().equals("Я Крестьянин!") && team.get(i).getHp() > 0 && team.get(i).delivery == 1) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String getInfo() {

        return "Я персонаж!";
    }

}
