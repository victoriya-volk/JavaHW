import Persones.*;

public class StartGame {
    public static void main(String[] args) {
        Farmer farmer_first = new Farmer("Bob", 10, 11, 12, 13, 14);
        Robber robber = new Robber("Rob", 11,12,13,14,15);
        Sniper sniper = new Sniper("Snake", 14, 16, 17, 18,20);
        Magician magician = new Magician("Mag", 13, 17, 14, 15, 22);
        Spearman spearman = new Spearman("Spear", 12,12,12,12,12);
        Monk monk = new Monk("Monk", 13,13,13,13,13);
    }
}
