package GameInterface;

import Persones.Character;

import java.util.ArrayList;

public interface GameInterface {
    void step();

    void step(ArrayList<Character> firstTeam, ArrayList<Character> secondTeam);

    StringBuilder getInfo();
}
