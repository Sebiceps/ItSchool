package oca_practice;

import java.lang.String;
public class InitializationExample {
    private String name = "Fluffy";
    {System.out.println("setting field"); }
public InitializationExample() {
        name = "Tiny";
    System.out.println("Setting constructor");
}

    public static void main(String[] args) {
        InitializationExample chick = new InitializationExample();
        System.out.println(chick.name);
    }
}
