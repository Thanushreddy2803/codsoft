import java.util.Scanner;

public class Task3 {
    static final int QUESTION_COUNT = 3;
    static final int TIME_LIMIT_SECONDS = 25;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[] questions = {
                "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "In which year did World War II end?"
        };

        String[][] options = {
                {"A) Rome", "B) Berlin", "C) Paris", "D) Madrid"},
                {"A) Venus", "B) Mars", "C) Jupiter", "D) Saturn"},
                {"A) 1943", "B) 1945", "C) 1950", "D) 1960"}
        };

        String[] correctAnswers = {"C", "B",  "B"};

        System.out.println("Welcome to the  Game!\n");

        for (int i = 0; i < QUESTION_COUNT; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);

            for (String j : options[i]) {
                System.out.println(j);
            }

            System.out.print("Your answer (A, B, C, or D): ");
            long startTime = System.currentTimeMillis();
            String userAnswer = scanner.next().toUpperCase();
            long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;

            if (userAnswer.equals(correctAnswers[i]) && elapsedTime <= TIME_LIMIT_SECONDS) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your final score is: " + score + " out of " + QUESTION_COUNT);
        System.out.println("Thank you for playing!");

        scanner.close();
    }
}