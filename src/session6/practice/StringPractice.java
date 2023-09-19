package session6.practice;

import java.util.UUID;

public class StringPractice {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str2 == str3);
        System.out.println(str2.equals(str3));

        UUID userId = UUID.randomUUID();
        System.out.println(userId);

        User userJohn = new User();
        userJohn.setUserId(userId);
        userJohn.setFirstName("John");

        System.out.println(userJohn.getFirstName() + ": " + userJohn.getUserId());
    }
}