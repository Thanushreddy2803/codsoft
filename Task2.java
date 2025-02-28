import java.util.Random;
import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!Be a champ!");

        do {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            System.out.println("\nRound " + (rounds + 1) + ": Guess the number between "
                    + minRange + " and " + maxRange);

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! Your guess is correct .");
                    guessedCorrectly = true;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (guessedCorrectly) {
                score += maxAttempts - attempts + 1;
                System.out.println("You guessed the number in " + attempts + " attempts.");
            } else {
                System.out.println("Sorry, you've reached the maximum attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (playAgain.equals("yes")) {
                rounds++;
            } else {
                System.out.println("Thanks for playing! Your total score is: " + score);
            }

        } while (rounds > 0);
        
        // Close the scanner
        scanner.close();
    }
}

    

