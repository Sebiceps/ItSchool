package session8.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("John");

        names.add(1, "Frank");

        //{Alice,Frank,John}
        // 0      1      2

        System.out.println(names);
        if (names.isEmpty()) {
            System.out.println("Names is empty");
        } else {
            System.out.println("Names list is not empty; size: " + names.size());
        }

        String firstElement = names.get(0);
        System.out.println("First element from names: " + firstElement);
    }
}