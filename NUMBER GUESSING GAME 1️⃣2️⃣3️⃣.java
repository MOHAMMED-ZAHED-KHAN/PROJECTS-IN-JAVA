import java.util.Random;
import java.util.Scanner;

public class sample {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      Random random = new Random();
      
      System.out.print("Enter a number between 1 to 10: ");

      int user = scanner.nextInt();

      int computer = random.nextInt(1,11);

      if(computer == user){
         System.out.println("u guessed it right " + computer + ":" + user);
      }
      else{
         System.out.println("u guessed it wrong " + computer + ":" + user);
      }

scanner.close();

   } 
} 
