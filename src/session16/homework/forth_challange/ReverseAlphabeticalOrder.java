//You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order.
// Next, modify your lambda expression to sort the list in reverse alphabetical order.


package session16.homework.forth_challange;

import java.util.Arrays;
import java.util.List;

public class ReverseAlphabeticalOrder {

    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("Dog", "Cat", "Brain", "Word");

        wordsList.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Words in alphabetical order: " + wordsList);

        wordsList.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Words in reversed alphabetical order: " + wordsList);
    }
}