package at.gwr.project.cesarencryption;

import java.util.*;

public class cesar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("1 - decrypt");
            System.out.println("2 - encrypt");
            String input = scanner.next();
            if (input.equals("1")) {
                decrypt(scanner);
            } else {
                if (input.equals("2")) {
                } else {
                    System.exit(0);
                }
            }
        }


    public static void decrypt(Scanner scanner) {
        System.out.println("Bitte eingeben:");
        char[] a = scanner.next().toCharArray();
        System.out.println();
        int n = 3;
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] + n);
            System.out.println(a[i]);
        }
    }
        public static void encrypt() {

        }
}