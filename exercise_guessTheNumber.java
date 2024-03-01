import java.util.Random;
import java.util.Scanner;

class game {
    Scanner sc = new Scanner(System.in);
    private int userInput;
    private int computerInp;
    private int guess = 0;

    public game() {
        Random num = new Random();
        computerInp = num.nextInt(1, 100);
    }

    void takeUserInput() {
        System.out.println("Enter you number : ");
        userInput = sc.nextInt();
        guess++;
    }

    void isCorrectNum() {
        while (userInput != computerInp) {
            if (userInput > computerInp) {
                System.out.println("Your number is greater than the computer input");
                takeUserInput();
            }
            if (userInput < computerInp) {
                System.out.println("Your number is less than the computer input");
                takeUserInput();
            }
        }
        System.out.println("Bingo!! you guess the right number ");
        System.out.printf("The computer number is  %d\n", computerInp);
    }

    int getNoOfGuess() {
        return guess;
    }
}

public class exercise_guessTheNumber {
    public static void main(String[] args) {
        game player1 = new game();
        player1.takeUserInput();
        player1.isCorrectNum();
        int guess = player1.getNoOfGuess();
        if (guess < 3) {
            System.out.println("You played brilliantly ");
        } else if (guess < 7) {
            System.out.println("Well played");
        } else {
            System.out.println("Try to guess earlier");
        }
    }
}