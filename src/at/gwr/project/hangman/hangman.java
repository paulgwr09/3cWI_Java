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
        for (int v = 0; v < 10; v++ ) {
            System.out.println("|");
        }
        char[] word = arr[0].toCharArray();

        for (int i = 0; i < stringlength; i++) {
            System.out.print("_");
        }
        System.out.println();

        for (int round = 0; round <= 10; round++) {
            System.out.println();
            System.out.println("Dein Buchstabe bitte eingeben: ");

            String letter = scanner.next();
            char[] myChars = letter.toCharArray();

            for (int j=0; j<stringlength; j++) {
                StringBuilder stringBuilder = new StringBuilder();
                String letterfound = "";
                if (arr[0].charAt(j) == letter.charAt(0)) {
                    stringBuilder.append(letterfound).append(letter);
                    System.out.print(stringBuilder);

                } else {
                    if (arr[0].charAt(j) != letter.charAt(0)) {
                        System.out.print("");
                    }
                }
                }

            }
        }
    }

