package JAVA;
import java.util.Scanner;
public class NumberGuessingGame {
 // Function that implements the
 // number guessing game
 public static void guessingNumberGame() {
     // Scanner Class
     Scanner sc = new Scanner(System.in);
     // Generate the numbers
     int number = 1 + (int)(1000 * Math.random());
     // Given T trials
     int T = 10;
     int i, guess;
     System.out.println(
         "A number is chosen" + " between 1 to 1000."+ "Guess the number"+ " within 10 trials.");
     for (i = 0; i < T; i++) {
         System.out.println(
             "Guess the number:");
         // Take input for guessing
         guess = sc.nextInt();
         // If the number is guessed
         if (number == guess) {
             System.out.println( "Nice you crayon eating motherfucer!"+ " You guessed the fucking number."+"That wasn't so hard you dick sucking faggot");
             break;
         }
         else if (number > guess && i != T - 1) {
             System.out.println("The number is " + "greater than " + guess);
         }
         else if (number < guess && i != T - 1) {
             System.out.println("The number is" + " less than " + guess);
         }
     }
     if (i == T) {
         System.out.println("Heavy sigh. . . . ."+ "Seriously?" + " You failed!!!" + "It's no wonder your parents are dissapointed in you");

         System.out.println(
             "The number was " + number);
     }
 }
 public static void
 main(String arg[]){
     guessingNumberGame();
 }
}