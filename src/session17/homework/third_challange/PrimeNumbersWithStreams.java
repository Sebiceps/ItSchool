//Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.

package session17.homework.third_challange;

import java.util.stream.IntStream;

public class PrimeNumbersWithStreams {
    public static void main(String[] args) {
        IntStream stream = IntStream.rangeClosed(1, 100);
        IntStream primeNumbers = stream.filter((int number) -> primeNumbers(number));
        primeNumbers.forEach(System.out::println);
    }

    public static boolean primeNumbers(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}