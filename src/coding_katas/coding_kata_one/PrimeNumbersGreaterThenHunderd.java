package coding_katas.coding_kata_one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrimeNumbersGreaterThenHunderd {
    public static void main(String[] args) {
        int start = 100;
        int upTo = 200;
        int howMany = 10;
        List<Integer> prime = getNPrimeNumbersInRange(start, upTo, howMany);
        System.out.println(prime);
        System.out.println(primesFromLoop(start, howMany));
    }

    public static List<Integer> getNPrimeNumbersInRange(int start, int upTo, int howMany) {
        List<Integer> integerList = new ArrayList<>();
        IntStream.rangeClosed(start, upTo)
                .filter(number -> primeNumbers(number))
                .limit(howMany)
                .forEach(integerList::add);
        return integerList;

    }

    public static List<Integer> primesFromLoop(int start, int howMany) {
        List<Integer> integerList = new ArrayList<>();
        for (int index = start; integerList.size() < howMany; index++) {
            if (primeNumbers(index)) {
                integerList.add(index);
            }
        }
        return integerList;
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
