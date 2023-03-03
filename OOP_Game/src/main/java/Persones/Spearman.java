package Persones;

import Persones.Character;

public class Spearman extends Character {
    boolean weapon;
    int strength;
    public Spearman(String name, int health, int attack, int speed, int endurance, int weapon) {
        super(name, health, attack, speed, endurance, weapon);
    }
}
