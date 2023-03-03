package Persones;

import Persones.Character;

public class Crossbowman extends Character {
    protected int ammunition;
    protected boolean masking;
    public Crossbowman(String name, int health, int attack, int speed, int endurance, int weapon) {
        super(name, health, attack, speed, endurance, weapon);
    }
}
