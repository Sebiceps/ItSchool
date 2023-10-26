//Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

package session16.homework.second_challange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AlphabeticalFilter {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ferrari", "Pagani", "Lamborghini", "Bugatti");

        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted List in alphabetical order: " + list);
    }


    // with this method i tried to solve the problem.....
//    public static List<String> alphabeticalOrder(List<String> list, Comparator comparator) {
//        List<String> sortedList = new ArrayList<>();
//        for (String item : list) {
//            sortedList.add(item);
//        }
//        return sortedList;
//    }
}

