package Persones;

public class Character {
    protected String name;
    protected int health;
    protected int attack;
    protected int speed;
    protected int endurance;
    protected int weapon;

    public Character(String name, int health, int attack, int speed, int endurance, int weapon) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.endurance = endurance;
        this.weapon = weapon;
    }

    public int getHealth() {
        return 0;
    }
    public int getSpeed() {
        return 0;
    }
    public int getAttack(){
        return 0;
    }

}
