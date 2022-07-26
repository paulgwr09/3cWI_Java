package at.gwr.project.cashmachine;

import java.util.*;

public class cashmachine {
    public static void main(String[] args) {

        bankbalance bankbalance = new bankbalance();
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        while (!isFinished) {
            selectNum(scanner, bankbalance);
        }
        scanner.close();
    }

    public static String selectNum(Scanner scanner, bankbalance bankbalance) {
        System.out.println("1 - Einzahlen");
        System.out.println("2 - Abheben");
        System.out.println("3 - Kontostand");
        System.out.println("4 - Bargeld");
        System.out.println("5 - Arbeiten");
        System.out.println("6 - Spenden");
        System.out.println("7 - Beenden");
        System.out.println();
        String input = scanner.next();
        if (input.equals("1")) {
            payin(scanner, bankbalance);
        } else {
            if (input.equals("2")) {
                payout(scanner, bankbalance);
            } else {
                if (input.equals("3")) {
                    viewbalance(bankbalance);
                } else {
                    if (input.equals("4")) {
                        viewcash(bankbalance);
                    } else {
                        if (input.equals("5")) {
                            work(scanner, bankbalance);
                        } else {
                            if (input.equals("6")) {
                                spent(bankbalance);
                            } else {
                                if (input.equals("7")) {
                                    System.exit(0);
                                    } else {
                                    System.out.println("Falsches Zeichen");
                                    System.exit(0);
                                }
                            }
                        }
                    }
                }
            }
        }
        return input;
    }

    public static void payin(Scanner scanner, bankbalance bankbalance) {
            rent(bankbalance);
            System.out.println("Wie viel möchtest du einzahlen?");
            int pay = Integer.parseInt(scanner.next());
            if (bankbalance.getCash() >= pay) {
            bankbalance.setBalance(bankbalance.getBalance() + pay);
            bankbalance.setCash(bankbalance.getCash() - pay);
            System.out.println("Dein Kontostand: " + bankbalance.getBalance() + "€");
            System.out.println("Dein Bargeld: " + bankbalance.getCash() + "€");
            System.out.println();
        } else {
                System.out.println("Das funktioniert nicht! du hast zu wenig Bargeld!");
                System.out.println();
            }
    }

    public static void payout(Scanner scanner, bankbalance bankbalance) {
        rent(bankbalance);
        System.out.println("Wie viel möchtest du auszahlen?");
        int payoff = Integer.parseInt(scanner.next());
        bankbalance.setBalance(bankbalance.getBalance() - payoff);
        bankbalance.setCash(bankbalance.getCash() + payoff);
        System.out.println("Dein Kontostand: " + bankbalance.getBalance() + "€");
        System.out.println("Dein Bargeld: " + bankbalance.getCash() + "€");
        if (bankbalance.getBalance() < 0) {

        }
        System.out.println();
    }

    public static void viewbalance(bankbalance bankbalance) {
        System.out.println("Dein Kontostand: " + bankbalance.getBalance() + "€");
        System.out.println();
    }

    public static void viewcash(bankbalance bankbalance) {
        System.out.println("Dein Bargeld: " + bankbalance.getCash() + "€");
        System.out.println();
    }

    public static void work(Scanner scanner, bankbalance bankbalance) {
        System.out.println("Du gehst Arbeiten.");
        bankbalance.setCash(bankbalance.getCash() + 500);
        System.out.println("Dein Bargeld: " + bankbalance.getCash() + "€");
        System.out.println();
    }

    public static void rent(bankbalance bankbalance) {
        if (bankbalance.getBalance() < 0) {
            bankbalance.setBalance(bankbalance.getBalance() + (bankbalance.getBalance()/100*2));
            System.out.println("Da du im Minus bist wurde dein Konto um 2% verzinst.");
        } else {
        }
    }

    public static void spent(bankbalance bankbalance) {
        bankbalance.setBalance(bankbalance.getBalance() - 50);
        System.out.println("Du hast 50€ gespendet!");
        System.out.println("Dein Kontostand: " + bankbalance.getBalance() + "€");
    }
}
