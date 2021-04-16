package assignment2.q2;

import java.util.Iterator;
import java.util.TreeSet;

public class Question2 {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        //Collection<String> set = new TreeSet<>(Collections.reverseOrder());
        set.add("Bob");
        set.add("Alice");
        set.add("John");
        set.add("Richard");

        Iterator<String> it = set.iterator();
        String query = "John";
        boolean result = false;

        while (it.hasNext()) {
            if (it.next().equals(query)) {
                result = true;
                break;
            }
        }

        if (result) System.out.println(query + " exists");
        else System.out.println(query + " doesn't exist");

    }

}