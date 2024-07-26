import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        Random random = new Random();

        int numberToGuess = random.nextInt(100)+1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessed= false;

        System.out.println("Welcome to The Number Guessing Game!!");
        System.out.println("I have selected a number between 1 to 100");
        System.out.println("Guess the number");

        while(!hasGuessed){
            System.out.println("Enter your guess :");
            guess = scanner.nextInt();
            numberOfTries++;

            if(guess<1 || guess>100){
                System.out.println("Please enter a number between 1 to 100");
    
            }else if (guess>numberToGuess){
                System.out.println("Your guess is higher");
            }else if(guess<numberToGuess){
                System.out.println("Your guess is lower");
            }else{
                hasGuessed=true;
                System.out.println("Hurray!! You guessed the number right :)");
                System.out.println("It took you "+ numberOfTries +" tries to guess the right number" );
            }
        }
        scanner.close();
    }
}