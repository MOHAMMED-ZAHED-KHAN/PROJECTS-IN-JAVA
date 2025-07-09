
import java.util.Scanner;

public class madlibsgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an adjective (description): ");
        String adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        String noun1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective2 = scanner.nextLine();
        System.out.print("Enter a verb which ends with -ing (action): ");
        String verb1 = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        String adjective3 = scanner.nextLine();

        System.out.println("\nToday i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        scanner.close();


    }
}
