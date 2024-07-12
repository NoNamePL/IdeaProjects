
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(100);

        System.out.println("Guessing correct number from 0 to 100");
        Scanner sc = new Scanner(System.in);
        int guess = sc.nextInt();
        while (guess!= n) {
            if (guess < n) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
            guess = sc.nextInt();
        }
        System.out.println("You guessed the correct number");
    }
}