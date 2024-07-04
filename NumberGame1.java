import java.util.Scanner;

public class NumberGame1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            // Difficulty selection and attempt limit
            int difficulty;
            int maxAttempts;//as per user selection
            do {
                System.out.println("Choose difficulty (enter 1, 2, or 3):");
                System.out.println("1. Easy (10 attempts)");
                System.out.println("2. Medium (7 attempts)");
                System.out.println("3. Hard (5 attempts)");
                difficulty = scanner.nextInt();
            } while (difficulty < 1 || difficulty > 3);

            switch (difficulty) {
                case 1:
                    maxAttempts = 10;
                    break;
                case 2:
                    maxAttempts = 7;
                    break;
                default: // Difficulty 3 (or any invalid input)
                    maxAttempts = 5;
            }

            // Generate random number and initialize score
            int myNumber = (int) (Math.random() * 101); // Generate random number between 1 and 100 (inclusive)
            int attempts = 0;
            int score = 0; // Higher score for fewer attempts

            System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

            do {
                attempts++;
               int guess = scanner.nextInt();

                if (guess == myNumber) {
                    score = maxAttempts - attempts + 1; // Calculate score 
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    System.out.println("Your score is " + score + ". (Higher score based on attempts)");
                    break;
                } else if (guess < myNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            } while (attempts < maxAttempts); // Loop continues until attempts reach limit

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The number was: " + myNumber);
            }

            // Play again  IF USER WANT
            do {
                System.out.println("\nDo you want to play again? (y/n)");
                playAgain = scanner.nextLine().toLowerCase();
            } while (!playAgain.equals("y") && !playAgain.equals("n"));

        } while (playAgain.equals("y")); // Repeat only if user enters "y" ELSE exit from the code

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
