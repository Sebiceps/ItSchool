package session15.generics;

import java.util.Arrays;
import java.util.List;

public class GenericsWildcard {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Alice", "Bob");
        List<Integer> integetList = Arrays.asList(1, 2, 3);

        printClassName(stringList);
        printClassName(integetList);
    }

    private static void printClassName(List<?> list) {
        System.out.println(list.get(0).getClass().getSimpleName());
    }
}