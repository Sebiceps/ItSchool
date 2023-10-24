package session16.string_processor;

public class TestStringProcessor {

    public static void main(String[] args) {
        StringProcessor removeWhiteSpaces = str -> str.trim();
        StringProcessor toUpperCase = str -> str.toUpperCase();

        StringProcessor result = removeWhiteSpaces.andThen(toUpperCase);
        System.out.println("Resul: " + result.process("          happy friday       "));
    }
}
