package session14;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> mySet = initializeSet();
        displayElements(mySet);
    }

    private static void displayElements(Set<String> setInput) {
        for (String input : setInput) {
            System.out.println(input);
        }
    }

    private static Set<String> initializeSet() {
        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("orange");
        mySet.add("apple");

        return mySet;
    }
}