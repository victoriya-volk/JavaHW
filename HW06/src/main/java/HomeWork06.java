import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HomeWork06 {
    public static void main(String[] args) {
        ArrayList<Integer> hashSetImitator = new ArrayList<>();
//        имитация добавления элементов
        int k;
        for (int i = 0; i < 10; i++) {
            int newNumber = new Random().nextInt(100);
            if (!hashSetImitator.contains(newNumber)) {
                hashSetImitator.add(newNumber);
                for (int j = 0; j < hashSetImitator.size(); j++) {
                    int swap = hashSetImitator.get(j);
                    for (k = j; k > 0 && swap < hashSetImitator.get(k - 1); k--) {
                        hashSetImitator.set(k, hashSetImitator.get(k - 1));
                    }
                    hashSetImitator.set(k, swap);
                }

            }
            else {
                System.out.println("Повтор!");
                i--;
            }
        }
        System.out.println(hashSetImitator);
//        имитация метода toString
        String hashSetString = "";
        for (int i = 0; i < hashSetImitator.size(); i++) {
            if (i == hashSetImitator.size()-1) {
                hashSetString += hashSetImitator.get(i);
            }
            else {
                hashSetString += hashSetImitator.get(i).toString() + ", ";
            }
        }
        System.out.println(hashSetString);
//        имитация перебора множества
        for (Integer hashSetElem: hashSetImitator) {
            System.out.print(hashSetElem + " ");
        }
    }
}
