package session7.homework;

//3. Create a Specific Date
//        Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//        Expected Output: A date object for 2025-8-19.


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class ThirdChallange {

    public static void main(String[] args) {

        LocalDate crateSpecificDate = LocalDate.of(2025, 8, 19);
        SimpleDateFormat simpleFormat = new SimpleDateFormat("MM");
        String month = simpleFormat.format(new Date());

        System.out.println("A specific date: " + crateSpecificDate);

    }
}
