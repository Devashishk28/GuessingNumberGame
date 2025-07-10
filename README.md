This is my first task as an intern!!
I made a "Number Guessing Game".
The code is explained as follows:

 (import java.util.*;)
//This imports Java utility classes and it includes:
//Scanner for user input
//Random for generating a random number

//Main Class & Method:
public class Guessingnumber {
    public static void main(String[] args) {
//This defines the class Guessingnumber and the main method which is the entry point of the program.

// Game Loop Control:
Scanner reader = new Scanner(System.in);
String play = "yes";
//reader: to read user input from the keyboard.
//play = "yes": initially set to "yes" so that the game starts.

//outer Loop (To Replay the Game):
while (play.equalsIgnoreCase("yes")) {
//This loop will repeat the entire game as long as the user says "yes" & it is case-insensitive.

//Generate Random Number:
Random random = new Random();
int randomNum = random.nextInt(100) + 1;
//Generates a random number between 1 and 100.
//nextInt(100) gives a number between 0 and 99 → adding 1 makes it 1 to 100.

Inner Loop (Guessing Loop):
int guess = -1;
int tries = 0;
while (guess != randomNum) {
//guess = -1 ensures the loop starts...since it's not equal to the random number.
//tries keeps track of how many guesses the user made.

//User Input and Feedback:
System.out.print("Guess a number between 1 & 100: ");
guess = reader.nextInt();
tries++;
//Prompts user for a guess.
//Reads and stores it in guess.
//Increments tries.

//Check the Guess:
if (guess == randomNum) {
    System.out.println("Awesome! You guessed the number in " + tries + " tries!");
    System.out.print("Would you like to play again? Yes or No: ");
    play = reader.next().toLowerCase();
//If guessed correctly, congratulate the user and ask if they want to play again.
//play = reader.next().toLowerCase(); updates the outer loop condition.


} else if (guess > randomNum) {
    System.out.println("Your guess is too high, try again.");
} else {
    System.out.println("Your guess is too low, try again.");
}
//Provides hints...if the guess is too high or too low

 //game ends:
reader.close();
System.out.println("Thanks for playing!");
//Closing the Scanner to free up resources.
//Printing a thank-you message.
