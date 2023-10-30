//Given a list of strings,use streams to create a single string which is a concatenation of all strings separated by a comma.
// (Input:List<String>strings=Arrays.asList("one","two","three","four");)

package session17.homework.forth_challange;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleStringUsingStreams {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("one", "two", "three", "four");
        printNumbersAsWords(strings);
    }

    public static void printNumbersAsWords(List<String> strings) {
        strings.stream()
                .collect(Collectors.joining(", "));
        System.out.println(strings);
    }
}