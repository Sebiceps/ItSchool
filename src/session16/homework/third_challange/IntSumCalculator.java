//Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.


        package session16.homework.third_challange;

import session12.compile_time_polymorphism.Calculator;

import java.util.Arrays;
import java.util.List;

public class IntSumCalculator {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(41, 57, 89, 92);

        int sum = list.stream().reduce(0, (x, y) -> x + y);

        System.out.println("The result of the calculation: " + sum);
    }
}
