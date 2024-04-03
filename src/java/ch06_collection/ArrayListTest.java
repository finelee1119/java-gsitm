package java.ch06_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("black", "white"));

        colors.add("pink");

        // advanced for
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("==========================");

        // Iterator 활용
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
           String c = iterator.next();
            System.out.println(c);
        }

    }

}
