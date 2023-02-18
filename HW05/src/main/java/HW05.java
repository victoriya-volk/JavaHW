import java.util.*;

public class HW05 {
    public static void main(String[] args) {
        HashMap<Integer, String> colorsVcb = new HashMap<>();
        colorsVcb.putIfAbsent(1, "Black");
        colorsVcb.putIfAbsent(2, "White");
        colorsVcb.putIfAbsent(3, "Grey");
        colorsVcb.putIfAbsent(3, "Yellow");
        System.out.println(colorsVcb);
        for(Map.Entry<Integer, String> pair: colorsVcb.entrySet()) {
            colorsVcb.put(pair.getKey(), pair.getValue() + "!");
        }
        System.out.println(colorsVcb);
        TreeMap<Number, String> colorsTreeMap = new TreeMap<>();
        colorsTreeMap.putIfAbsent(1, "Green");
        colorsTreeMap.putIfAbsent(2, "Red");
        colorsTreeMap.putIfAbsent(3, "Blue");
        colorsTreeMap.putIfAbsent(1, "Black");
        System.out.println(colorsTreeMap);
        for(Map.Entry<Number, String> entry: colorsTreeMap.entrySet()) {
            colorsTreeMap.put(entry.getKey(), entry.getValue() + "!");
        }
        System.out.println(colorsTreeMap);

        for (int i = 0; i < 997; i++) {
            colorsVcb.putIfAbsent(new Random().nextInt(10000001), "Color");
        }
        long startHM = System.currentTimeMillis();
        for (Map.Entry<Integer, String> pair: colorsVcb.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        int endHM = (int)(System.currentTimeMillis() - startHM);

        for (int i = 0; i < 997; i++) {
            colorsTreeMap.putIfAbsent(new Random().nextInt(10000001), "Color");
        }
        long startTM = System.currentTimeMillis();
        for(Map.Entry<Number, String> entry: colorsTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        int endTM = (int)(System.currentTimeMillis() - startTM);
        System.out.println("Перебор HashMap " + endHM + " перебор TreeMap " + endTM);
    }
}
