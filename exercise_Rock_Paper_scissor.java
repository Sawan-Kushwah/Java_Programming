import java.util.Random;
import java.util.Scanner;

public class exercise_Rock_Paper_scissor {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random random = new Random();
        int comp = random.nextInt(3);
//        System.out.println(comp);
        int user_point = 0;
        int comp_point = 0;
        int i = 0;
        System.out.println("This is a five round match");
        while (i < 5) {
            System.out.println("Enter 1 for ROCK \n\t  2 for PAPER \n\t  3 for SCISSOR");
            int user = Input.nextInt();
            if (comp == 0 && user == 1) {
                System.out.println("It's a draw");
                System.out.println("You both chooses Rock");
                user_point += 1;
                comp_point += 1;
            } else if (comp == 1 && user == 2) {
                System.out.println("It's a draw");
                System.out.println("You both chooses Paper");
                user_point += 1;
                comp_point += 1;
            } else if (comp == 2 && user == 3) {
                System.out.println("It's a draw");
                System.out.println("You both chooses Scissor");
                user_point += 1;
                comp_point += 1;
            } else if (comp == 0 && user == 2) {
                System.out.println("User won !");
                System.out.println("computer chooses Rock");
                System.out.println("you chooses Paper");
                user_point += 1;
            } else if (comp == 0 && user == 3) {
                System.out.println("Computer won !");
                System.out.println("computer chooses Rock");
                System.out.println("you chooses Scissor");
                comp_point += 1;
            } else if (comp == 1 && user == 1) {
                System.out.println("Computer won !");
                System.out.println("computer chooses Paper");
                System.out.println("you chooses Rock");
                comp_point += 1;
            } else if (comp == 1 && user == 3) {
                System.out.println("User won !");
                System.out.println("computer chooses Paper");
                System.out.println("you chooses Scissor");
                user_point += 1;
            } else if (comp == 2 && user == 1) {
                System.out.println("User won !");
                System.out.println("computer chooses Scissor");
                System.out.println("you chooses Rock");
                user_point += 1;
            } else if (comp == 2 && user == 2) {
                System.out.println("Computer won !");
                System.out.println("computer chooses Scissor");
                System.out.println("you chooses Paper");
                comp_point += 1;
            } else {
                System.out.println("You enter wrong choice");
            }
            i++;
            System.out.println("\n");
        }
        System.out.println("Your score " + user_point);
        System.out.println("Computer score " + comp_point);
        if (user_point >= comp_point) {
            System.out.println("Congratulation ,You have won the match!!");
        } else {
            System.out.println("Sad, Computer won the match");
        }

    }
}
