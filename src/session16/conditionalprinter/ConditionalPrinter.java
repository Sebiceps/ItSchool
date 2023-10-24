package session16.conditionalprinter;

@FunctionalInterface
public interface ConditionalPrinter {

    void print(String str, boolean condition);
}