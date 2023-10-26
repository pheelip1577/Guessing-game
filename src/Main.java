import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Guess the number game");

        // Ask for the user's name and welcome the user
        System.out.println("What is your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome to the Guess the number game " + name);

        // Ask if we should start the game
        System.out.println("Do you want to start the game? YES or NO");
        String start = scanner.nextLine();

        // Define constants for YES and NO
        final String YES = "YES";
        final String NO = "NO";

        if (start.equals(YES)) {
            Random random = new Random();
            int number = random.nextInt(20) + 1; // Generate a number between 1 and 20
            System.out.println("Guess a number from 1 to 20 ");

            int num_guess = 0; // Initialize the guess count
            int guess;

            while (num_guess < 5) {
                guess = scanner.nextInt();
                num_guess++;

                if (guess == number) {
                    System.out.println("Congratulations " + name + " you won!");
                    break;
                } else if (num_guess < 5) {
                    System.out.println("Keep guessing");
                } else {
                    System.out.println("Game over. The correct number was " + number);
                }
            }
        } else {
            System.out.println("Please start again and enter " + YES);
        }
    }
}
