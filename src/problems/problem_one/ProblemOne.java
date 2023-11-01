package problems.problem_one;

import java.util.Arrays;

public class ProblemOne {

    public static void main(String[] args) {
        String sentence = "Today is Halloween";
        //split sentence in words

        long result = Arrays.stream(sentence.split(""))
                .filter(word -> word.length() > 3)
                .count();

        System.out.println(result);
    }
}
