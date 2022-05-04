package at.gwr.project.hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }

    public static void start(Scanner scanner) {


        String[] arr;
        arr = new String[1];

        arr[0] = scanner.next();
        int stringlength = arr[0].length();

        for (int i = 0; i == arr[0].length(); i++) {
            System.out.print("-")
        }



    }
}
