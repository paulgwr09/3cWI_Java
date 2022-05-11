package at.gwr.project.hangman;

import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        start(scanner);
    }


    public static void start(Scanner scanner) {

        String[] arr = new String[1];
        arr[0] = scanner.next();
        String wordword = new String(new char[arr[0].length()]).replace("\0", "*");
        System.out.println();
        int round = 0;

        while (round < 7 && wordword.contains("*")) {
            System.out.println("Dein Buchstabe bitte eingeben: ");
            System.out.println(wordword);
            String letter = scanner.next();
            String letterfound = "";

            for (int j=0; j<arr[0].length(); j++) {
                if (arr[0].charAt(j) == letter.charAt(0)) {
                    letterfound += letter.charAt(0);
                } else if (wordword.charAt(j) != '*') {
                    letterfound += arr[0].charAt(j);
                } else {
                    letterfound += "*";
                }
                }
            if (wordword.equals(letterfound)) {
                round++;
            } else {
                wordword = letterfound;
            }
            if (wordword.equals(arr[0])) {
                System.out.println("Du hast es Geschafft");
            }
        }
    }
}


