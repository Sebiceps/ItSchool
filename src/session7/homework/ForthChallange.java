package session7.homework;

//4. Comparing User-Entered Dates
//        Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
//        Input: Two dates entered by the user in the format YYYY-MM-DD.
//        Expected Output:
//        true if both dates are equal.
//        false if they are different.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ForthChallange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first date in format 'YYYY-MM-DD': ");
        String date1 = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Please enter the second date in format 'YYYY-MM-DD': ");
        String date2 = scanner.nextLine();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(date1.equals(date2));

    }
}