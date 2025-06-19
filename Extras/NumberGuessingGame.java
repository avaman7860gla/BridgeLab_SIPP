import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        String feedback;
        int guess;

        System.out.println("Think of a number between 1 and 100 and I will try to guess it.");

        do {
            guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = scanner.nextLine();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }

        } while (!feedback.equalsIgnoreCase("correct"));

        System.out.println("Hooray! I guessed your number.");
    }

    static int generateGuess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }
}
