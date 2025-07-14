import java.util.Scanner;
import java.util.Random;


public class rockpaperscissor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock","Paper","Scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";


        do{
            System.out.print("Enter your move (Rock,Paper,Scissors): ");
        playerChoice = scanner.nextLine();

        if(!playerChoice.equalsIgnoreCase("Rock") && !playerChoice.equalsIgnoreCase("Paper") && !playerChoice.equalsIgnoreCase("Scissors")){
            System.out.println("Invalid Choice");
            continue;
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        if(playerChoice.equalsIgnoreCase(computerChoice)){
            System.out.println("It's a tie!");
        }

        else if((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
        (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
        (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Peper"))){
            System.out.println("You win!");
        }

        else{
            System.out.println("You Lose!");
        }

        System.out.println("Play again (Yes/No)? : ");
        playAgain = scanner.nextLine();

        }while(playAgain.equalsIgnoreCase("Yes"));

        
        System.out.println("Thanks for playing!");


        scanner.close();


    }
}
