package problems.problem_three;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class ProblemThree {
    public static void main(String[] args) {
        List<Integer> randomNumbers = Arrays.asList(1, 4, 6, 849, 84, 65, 98, 156, 59, 8);
        printMinAndMax(randomNumbers);
    }

    private static void printMinAndMax(List<Integer> list) {
        OptionalInt min = list.stream()
                .mapToInt(Integer::intValue)
                .min();

        OptionalInt max = list.stream()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println("Min: " + min.getAsInt() + " max: " + max.getAsInt());
    }
}
