package problems.problem_five;

import java.util.Arrays;
import java.util.Collections;

public class ProblemFive {
    public static void main(String[] args) {
        String sentence = "Java is very fun";

        String[] sentenceArray = sentence.split(" ");
        StringBuilder builder = new StringBuilder();


        for (int index = sentenceArray.length - 1; index >= 0; index--){
            builder.append(sentenceArray[index] + " ");
        }
        System.out.println(builder);
        Collections.reverse(Arrays.asList(sentenceArray));
        System.out.println(Arrays.asList(sentenceArray));
    }
}