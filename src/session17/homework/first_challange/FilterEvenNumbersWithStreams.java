//Given a list of integers, create a new list that contains only the even numbers.
// Use streams to achieve this. (Input: List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);)

package session17.homework.first_challange;

import java.util.Arrays;
import java.util.List;

public class FilterEvenNumbersWithStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);
        printEvenNumbers(numbers);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(gheorghe -> gheorghe % 2 == 0)
                .toList();
        System.out.println("The even numbers are: " + evenNumbers);
    }
}