package session16.calculator;

public class TestCalculator {

    public static void main(String[] args) {
        Calculator calculator = (a, b, operator) -> {
            switch (operator) {
                case '+':
                    return a + b;
                case '-':
                    return a - b;
                case '*':
                    return a * b;
                case '/':
                    return a / b;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
        };

        System.out.println("Result: " + calculator.calculate(10,10,'*'));
    }
}
