import java.util.*;

public class Guessingnumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        while (play.equalsIgnoreCase("yes")) {
            Random random = new Random();
            int randomNum = random.nextInt(100) + 1; // to get 1–100 instead of 0–99
            int guess = -1;
            int tries = 0;

            while (guess != randomNum) {
                System.out.print("Guess a number between 1 & 100: ");
                guess = reader.nextInt();
                tries++;

                if (guess == randomNum) {
                    System.out.println("Awesome! You guessed the number in " + tries + " tries!");
                    System.out.print("Would you like to play again? Yes or No: ");
                    play = reader.next().toLowerCase();
                } else if (guess > randomNum) {
                    System.out.println("Your guess is too high, try again.");
                } else {
                    System.out.println("Your guess is too low, try again.");
                }
            }
        }

        reader.close();
        System.out.println("Thanks for playing!");
    }
}
