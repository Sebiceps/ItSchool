package session16.conditionalprinter;

public class TestConditionalPrinter {

    public static void main(String[] args) {
        ConditionalPrinter conditionalPrinter = (str, condition) -> showCondition(str, condition);

        conditionalPrinter.print("Hello world", true);
        conditionalPrinter.print("Another hello", false);
    }

    private static void showCondition(String str, boolean condition) {
        if (condition) {
            System.out.println(str);
        }

    }
}