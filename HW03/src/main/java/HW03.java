import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HW03 {
    public static void main(String[] args) {
        List<String> my_list = new ArrayList<>();
        my_list.add("Black");
        my_list.add("White");
        my_list.add("Green");
        my_list.add("Red");
        my_list.add("Blue");
        System.out.println(my_list);
        for (int i = 0; i < my_list.size(); i++) {
            my_list.set(i, (my_list.get(i) + "!"));
        }
        System.out.println(my_list);
        my_list.add(0, "Brown");
        System.out.println(my_list);
        String elem = my_list.get(1);
        System.out.println(elem);
        my_list.set(1, "Grey");
        System.out.println(my_list);
        my_list.remove(2);
        System.out.println(my_list);
        System.out.println(my_list.indexOf("Red!"));

        List<String> my_new_list = new ArrayList<>();
        my_new_list.add(my_list.get(0));
        my_new_list.add(my_list.get(2));
        my_new_list.add(my_list.get(4));
        System.out.println("second list: ");
        System.out.println(my_new_list);

        System.out.println("first list before remove: ");
        System.out.println(my_list);

        for (int i = 0; i < my_list.size(); i++) {
            if (! my_new_list.contains(my_list.get(i))) {
                my_list.remove(i);
            }
        }
        System.out.println("first list after remove: ");
        System.out.println(my_list);
        Collections.sort(my_list);
        System.out.println("first list after sort");
        System.out.println(my_list);
    }
}
