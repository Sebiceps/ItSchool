//Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.

package session16.homework.first_challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;

public class EvenNumberFilter {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbers = filterList(numbers, n -> n % 2 == 0);

        System.out.println("Even Numbers: " + evenNumbers);
    }

    public static List<Integer> filterList(List<Integer> list, IntPredicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (predicate.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

