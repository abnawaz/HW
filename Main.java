import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;
        boolean guessedCorrectly = false;

        System.out.println("Guess a number between 1 and 10. You have " + attempts + " attempts.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();

            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You've guessed the correct number.");
                guessedCorrectly = true;
                break;
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high, try again.");
            } else {
                System.out.println("Too low, try again.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}
