package session3.homework;

import java.util.Scanner;
public class Homework {

    static String firstname = "Sebi";
    static String lastname = "Conete";
    static String email = "seb.conete2001@gmail.com";
    static String password = "1234";
    static byte age = 22;
    static String colour = "blue";
    static boolean isMajor = true;

    public static void main(String[] args) {
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(age);
        System.out.println(colour);
        System.out.println(email);
        System.out.println(password);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello new user, please tell me your name!");
        String userName = scanner.nextLine();

        System.out.println("Hello" + userName + "!");
        System.out.println(userName + ", what is your favourite colour?");
        String colour = scanner.nextLine();
        System.out.println("Nice colour!");
        System.out.println("Please tell me your age!");
        String age = scanner.nextLine();
        System.out.println("Please, enter your email adress");
        String email = scanner.nextLine();
        System.out.println("Please enter a password!");
        String password = scanner.nextLine();
        System.out.println("Thank you, soon you will recive an email for your account confirmation. Have a great day!");
    }
}
