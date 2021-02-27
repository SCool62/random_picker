package dev.scool.randompicker;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] answers;
        System.out.println("Welcome to SCool's random picker");

        int numChoices = Integer.decode(Input.getInput("Enter the number of choices"));
        answers = new String[numChoices];
        Random random = new Random();

        for (int i = 0;i < numChoices;i++) {
            int choice = i + 1;
            answers[i] = Input.getInput("Enter choice " + choice);
        }
        System.out.println("The answer is:");
        System.out.println(answers[random.nextInt(answers.length)]);

    }
}

class Input {
    private static final Scanner scan = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.println(prompt);
        return scan.nextLine();
    }
}
