//Using a list of strings, find and print the longest string using Java streams.
// (Input: List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");)

package session17.homework.second_challange;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintLongestStringWithStreams {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        printLongestString(strings);
    }

    private static void printLongestString(List<String> string) {
        String fruit = string.stream()
                .max((string1, string2) -> Integer.compare(string1.length(),string2.length()))
                        .orElse("null");
        System.out.println("The longest fruit from the list is: " + fruit);
    }
}
