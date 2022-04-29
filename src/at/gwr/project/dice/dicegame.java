package at.gwr.project.dice;

import com.sun.jdi.Value;

import java.util.*;
import java.util.Random;

public class dicegame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        value value = new value();

        System.out.println("1 - Spielen");
        System.out.println("2 - Beenden");
        String input = scanner.next();

        if (input.equals("1")) {
            com(random, value);
            player(random, value);
            calc(value);
        } else {
            System.exit(0);
        }

        scanner.close();
    }


    public static void com(Random random, value value) {
        int com = 0;
        for (int i = 0; i <= 6; i++) {
        int rancom = random.nextInt((6 - 1) + 1) + 1;
        com = com + rancom;
        }
        System.out.println("Der Computer hat " + com + " Punkte gewürfelt!");
        value.setValuecom(value.getValuecom() + com);
    }

    public static void player(Random random, value value) {
        int player = 0;
        for (int i = 0; i <= 6; i++) {
            int ranplayer = random.nextInt((6 - 1) + 1) + 1;
            player = player + ranplayer;
        }
        System.out.println("Du hast " + player + " Punkte gewürfelt!");
        value.setValueplayer(value.getValueplayer() + player);
    }

    public static void calc(value value) {
        if (value.getValuecom()>value.getValueplayer()) {
            System.out.println("Der Computer hat gewonnen!");
        } else {
            System.out.println("Du hast gewonnen!");
        }
    }
}
