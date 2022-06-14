package at.gwr.project.toUpperCaseToLowerCase;

import java.util.Locale;
import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        String answerup = "";
        String answerlow = "";

        for (int i = 0; i < t.length();i++) {
            String letterup = t.toUpperCase();
            String letterlow = t.toLowerCase();
            if (t.charAt(i) == letterup.charAt(i)) {
                answerup = answerup + t.charAt(i);
            } else if (t.charAt(i) == letterlow.charAt(i)) {
                answerlow = answerlow + t.charAt(i);
            }
        }
        System.out.println(answerup);
        System.out.println(answerlow);
    }
}
