package problems.problem_four;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProblemFour {
    public static void main(String[] args) {
        List<String> pets = Arrays.asList("Dog", "Cat", "Dog", "Duck", "Cat");
        Map<String, Long> duplicates = findDuplicates(pets);

        duplicates.forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static Map<String, Long> findDuplicates(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}