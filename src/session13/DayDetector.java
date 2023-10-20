package session13;

public class DayDetector {

    public static void main(String[] args) {

        dayChecker("sunday");
        dayChecker("saturday");
        dayChecker("pie");
        dayChecker("monday");
    }

    public static void dayChecker(String day) {
        switch (day.toLowerCase()) {
            case "saturday", "sunday" -> System.out.println("It's a weekend day");
            case "monday", "tuesday" -> System.out.println("It's weekday");
            default -> System.out.println("Invalid day.");
        }
    }
}