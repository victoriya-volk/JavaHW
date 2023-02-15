import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HomeWork04 {
    public static void main(String[] args) {
        FileWriter firstTaskWriter = null;
        try {
            firstTaskWriter = new FileWriter("task01.sql");
            firstTaskWriter.append("New text for first task.");
            firstTaskWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        FileReader firstTaskReader = null;
        String text = "";
        try {
            firstTaskReader = new FileReader("task01.sql");
            while (firstTaskReader.ready()) {
                text += (char)firstTaskReader.read();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(text);

        FileReader secondTaskReader = null;
        String peoples = "";
        try {
            secondTaskReader = new FileReader("task02.sql");
            while (secondTaskReader.ready()) {
                peoples += (char)secondTaskReader.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(peoples);
        String[] peoplesList = peoples.split("\n");
//        System.out.println(Arrays.toString(peoplesList));
        ArrayList<Integer> peopleID = new ArrayList<>();
        ArrayList<String> peoplesFamilyNames = new ArrayList<>();
        ArrayList<String> peoplesFirstNames = new ArrayList<>();
        ArrayList<String> peoplesSecondNames = new ArrayList<>();
        ArrayList<Integer> peoplesAges = new ArrayList<>();
        ArrayList<Boolean> peoplesGenders = new ArrayList<>();
        for (int i = 0; i < peoplesList.length; i++) {
            String[] people = peoplesList[i].split(" ");
            peopleID.add(i);
            peoplesFamilyNames.add(people[0]);
            peoplesFirstNames.add(people[1]);
            peoplesSecondNames.add(people[2]);
            peoplesAges.add(Integer.parseInt(people[3]));
            peoplesGenders.add(people[4].contains("М")?false:true);
        }
        for (int i = 0; i < peopleID.size(); i++) {
            System.out.print(peoplesFamilyNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesFirstNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesSecondNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesAges.get(peopleID.get(i)) + " ");
            if (peoplesGenders.get(peopleID.get(i)) == true) {
                System.out.print("Ж\n");
            } else {
                System.out.print("М\n");
            }
        }
//      First variant

        ArrayList<Integer> sortArr = new ArrayList<Integer>(peoplesAges);
        Collections.sort(sortArr);

//      Second variant

        ArrayList<Integer> sortArr2 = new ArrayList<Integer>(peoplesAges);
        int j;
        for (int i = 1; i < sortArr2.size(); i++) {
            int swap = sortArr2.get(i);
            for (j = i; j > 0 && swap < sortArr2.get(j - 1); j--) {
                sortArr2.set(j, sortArr2.get(j - 1));
            }
            sortArr2.set(j, swap);
        }

        for (int i = 0; i < peopleID.size(); i++) {
            peopleID.set(i, peoplesAges.indexOf(sortArr2.get(i)));
        }
        System.out.println("After sort");
        for (int i = 0; i < peopleID.size(); i++) {
            System.out.print(peoplesFamilyNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesFirstNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesSecondNames.get(peopleID.get(i)) + " ");
            System.out.print(peoplesAges.get(peopleID.get(i)) + " ");
            if (peoplesGenders.get(peopleID.get(i)) == true) {
                System.out.print("Ж\n");
            } else {
                System.out.print("М\n");
            }
        }
    }
}
