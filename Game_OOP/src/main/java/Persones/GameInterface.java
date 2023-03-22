package Persones;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam);
    String getInfo();
}
