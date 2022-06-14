package at.gwr.project.sentenceGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class sentenceGenerator {

    static List<String> nomeList = new ArrayList<String>(Arrays.asList("Er", "Sie", "Es"));
    static List<String> verbList = new ArrayList<String>(Arrays.asList("geht", "lauft", "sprintet"));
    static List<String> destinationList = new ArrayList<String>(Arrays.asList("nach Hause", "zur Brücke", "zum Spar"));

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isFinished = false;
        while (!isFinished) {
            select(scanner);
        }
        scanner.close();
}


    public static void select(Scanner scanner) {
        System.out.println();
        System.out.println("1 - Zufälliger Satz generieren");
        System.out.println("2 - Nomen hinzufügen");
        System.out.println("3 - Verb hinzufügen");
        System.out.println("4 - Ort hinzufügen");
        System.out.println("Beliebige andere Taste eingeben um das System zu schließen.");
        String input = scanner.next();
        if (input.equals("1")) {
            generator();
        } else {
            if (input.equals("2")) {
                addNome(scanner);
            } else {
                if (input.equals("3")) {
                    addVerb(scanner);
                } else {
                    if (input.equals("4")) {
                        addDestination(scanner);
                    } else {
                        System.out.println("Auf Wiedersehen!");
                        System.exit(0);
                    }
                }
            }
        }
    }

    public static void generator() {
        String randomNome = nomeList.get(generateRandomNumber(nomeList.size()));
        String randomVerb = verbList.get(generateRandomNumber(verbList.size()));
        String randomDestination = destinationList.get(generateRandomNumber(destinationList.size()));
        String sentence = randomNome + " " + randomVerb + " " + randomDestination + ".";
        System.out.println(sentence);
}

    public static int generateRandomNumber(int max) {
        final Random random = new Random();
        return (int) random.nextInt(max);
    }

    public static void addNome(Scanner scanner) {
        String nome = scanner.next();
        String.valueOf(nomeList.add(nome));
    }

    public static void addVerb(Scanner scanner) {
        String verb = scanner.next();
        String.valueOf(verbList.add(verb));
    }

    public static void addDestination(Scanner scanner) {
        System.out.println("Zuerst das Lokaladverb eingeben und beim 2. Input der Ort.");
        String destination = scanner.next() + " " + scanner.next();
        String.valueOf(destinationList.add(destination));
    }
}
