package session7.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//1. Displaying Today's Date
//Description: Write a method named displayTodaysDate that, when called, prints the current date to the console.
//Expected Output: Today's date in the format YYYY-MM-DD.

public class FirstChallange {

    public static void main(String[] args) {

        LocalDate current = LocalDate.now();
        System.out.println("Current time in the format 'YYYY-MM-DD' is: " + current);
    }
}
