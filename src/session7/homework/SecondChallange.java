package session7.homework;

//2. Date Decomposition
//        Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
//        Input: A date in the format YYYY-MM-DD.
//        Expected Output:
//        makefile
//        Copy code
//        Year: YYYY
//        Month: MM
//        Day: DD

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class SecondChallange {

    public static void main(String[] args) {

        LocalDate current = LocalDate.now();
        SimpleDateFormat simpleFormat = new SimpleDateFormat("MM");
        String month = simpleFormat.format(new Date());


        System.out.println("Year: " + current.getYear());
        System.out.println("Month: " + month);
        System.out.println("Day: " + current.getDayOfMonth());
    }

}