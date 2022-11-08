package lv.acodemy.classroom;

import java.util.Scanner;

public class Interactive {
    public static void main(String[] args) {
        Scanner chatBot = new Scanner(System.in);
        System.out.println("What name?");
        String name = chatBot.next();

        System.out.println("Last name?");
        String lastname = chatBot.next();

        System.out.printf("Hay %s %s. My Name is Bot Alex. Can I help u?", name, lastname);

        System.out.println("Press 1 for reg or press 2 to stop");
        byte answer = chatBot.nextByte();
        if(answer == 1) {
            System.out.println("Folow format: (dd-mm-yyyy)");
            String reg = chatBot.next();
            System.out.println("You regis on date:" + reg);
        } else if(answer == 2) {
            System.out.println("Ok");
            chatBot.close();
        } else {
            System.out.println("Try Again!");
        }

        }
    }

