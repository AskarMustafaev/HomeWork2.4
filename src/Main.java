import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("A1");
        users.add("A2");
        users.add("A3");
        users.add("A4");
        users.add("A5");
        System.out.println("1) List of A " + users);

        ArrayList<String> users2 = new ArrayList<>();
        users2.add("B1");
        users2.add("B2");
        users2.add("B3");
        users2.add("B4");
        users2.add("B5");
        System.out.println("2) List of B " + users2);

        users.addAll(users2);
        Collections.shuffle(users);
        System.out.println("3) List of C " + users);

        users.addAll(users2);
        Collections.sort(users);
        System.out.println("4) List of C. After sort " + users);

    }

}