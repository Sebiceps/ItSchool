package session6.practice;

public class ProductCodeComparison {

    public static void main(String[] args) {
        String fixedCode = "PROD12345";

        String code1 = new String("PROD123445");
        String code2 = "PROD12345";
        String code3 = "PROD" + "12345";

        System.out.println("Using == operatior"); //compara valoare
        System.out.println("fixedCode vs code1: " + (fixedCode == code1));
        System.out.println("fixedCode vs code2: " + (fixedCode == code2));
        System.out.println("fixedCode vs code3: " + (fixedCode == code3));

        System.out.println("Using equals()"); //compara continutul
        System.out.println("fixCode:" + fixedCode.equals(code1));
        System.out.println("fixCode:" + fixedCode.equals(code2));
        System.out.println("fixCode:" + fixedCode.equals(code3));
    }
}
