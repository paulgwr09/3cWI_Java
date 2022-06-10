package at.gwr.project.Test_Kaffeemaschine;

import java.util.*;

public class coffeemachine {
    public static void main(String[] args) {
        coffee coffee = new coffee();
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        while (!isFinished) {
            selectNum(scanner, coffee);
        }
        scanner.close();
    }

    public static String selectNum(Scanner scanner, coffee coffee) {
        System.out.println();
        System.out.println("1 - Einschalten");
        System.out.println("2 - Größe einstellen (40 - 200 ml)");
        System.out.println("3 - Stärke einstellen (1 - 10 Bohnen)");
        System.out.println("4 - Wasser nachfüllen");
        System.out.println("5 - Bohnen nachfüllen");
        System.out.println("6 - Kaffee rauslassen");
        System.out.println("7 - Ausschalten");
        System.out.println("Beliebige andere Taste eingeben um das System zu schließen.");
        System.out.println();
        String input = scanner.next();
        if (input.equals("1")) {
            puton(coffee);
        } else {
            if (input.equals("2")) {
                size(scanner, coffee);
            } else {
                if (input.equals("3")) {
                    amountBeans(scanner, coffee);
                } else {
                    if (input.equals("4")) {
                        waterrefill(coffee);
                    } else {
                        if (input.equals("5")) {
                            beansrefill(coffee);
                        } else {
                            if (input.equals("6")) {
                                letOutCoffee(coffee);
                            } else {
                                if (input.equals("7")) {
                                    putoff(coffee);
                                } else {
                                    System.out.println("Wiedersehen");
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

    public static void puton(coffee coffee) {
        if (coffee.getOn() == 0) {
            coffee.setOn(coffee.getOn() + 1);
            System.out.println("Die Kaffeemaschine ist nun eingeschaltet.");
        } else {
            System.out.println("Die Kaffeemaschine ist schon eingeschaltet!");
        }
    }

    public static void size(Scanner scanner, coffee coffee) {
        System.out.println("Wie groß soll ihr Kaffe sein?");
        coffee.setCoffeesize(scanner.nextInt());
        if (coffee.getCoffeesize() <=200 && coffee.getCoffeesize() >=40) {
            System.out.println("Die Größe des Kaffees beträgt " + coffee.getCoffeesize() + " ml.");
        } else {
            System.out.println("Du hast einen flaschen  Betrag ausgewählt!");
        }
    }

    public static void amountBeans(Scanner scanner, coffee coffee) {
        System.out.println("Wie Stark soll ihr Kaffee sein?");
        coffee.setAmount(scanner.nextInt());
        if (coffee.getAmount() <=10 && coffee.getAmount() >= 1) {
            System.out.println("Die Stärke des Kaffees beträgt " + coffee.getAmount() + " / 10.");
        } else {
            System.out.println("Du hast einen falschen Betrag ausgewählt!");
        }

    }

    public static void waterrefill(coffee coffee) {
        coffee.setWater(1000);
        System.out.println("Das Wasser wurde aufgefüllt.");
    }

    public static void beansrefill(coffee coffee) {
        coffee.setBeans(100);
        System.out.println("Die Bohnen wurden aufgefüllt.");
    }

    public static void letOutCoffee(coffee coffee) {
        if (coffee.getOn() == 1) {
            if (coffee.getWater() > coffee.getCoffeesize() && coffee.getBeans() > coffee.getAmount()) {
                System.out.println("Hier ist ihr Kaffee: ⅽ[ː̠̈ː̠̠̈] ͌");
                coffee.setWater(coffee.getWater()-coffee.getCoffeesize());
                coffee.setBeans(coffee.getBeans()-coffee.getAmount());
                System.out.println("In der Kaffeemaschine befinden sich noch " + coffee.getBeans() + " Bohnen.");
                System.out.println("In der Kaffeemaschine befinden sich noch " + coffee.getWater() + " ml Wasser.");

            } else {
                System.out.println("Du hast entweder zu wenig Wasser oder zu wenig Bohnen!");
                System.out.println("In deiner Kaffemachine befinden sich noch " + coffee.getWater() + " ml Wasser.");
                System.out.println("In deiner Kaffemachine befinden sich noch " + coffee.getBeans() + " Bohnen.");
            }
        } else {
            System.out.println("Bitte die Kaffeemaschine noch einschalten!");
        }
    }

    public static void putoff(coffee coffee) {
        if (coffee.getOn() == 1) {
            coffee.setOn(coffee.getOn() - 1);
            System.out.println("Die Kaffeemaschine ist nun ausgeschaltet.");
        } else {
            System.out.println("Die Kaffeemaschine ist schon ausgeschaltet!");
        }

    }
}
