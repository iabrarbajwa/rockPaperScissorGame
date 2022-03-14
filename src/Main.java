import java.util.Scanner;
import  java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] rps = {"Rock", "Paper", "Scissor"};


        int computerPoints = 0;
        int yourPoints = 0;
        int tie = 0;

        int i = 0;

        System.out.println("There will be 5 rounds in this game.");

        while(i < 5){
            String computerMove = rps[random.nextInt(rps.length)];
            System.out.println("Please enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
            String yourMove = rps[scanner.nextInt(rps.length)];
            System.out.println("You move is: " + yourMove);
            System.out.println("Computer move is: " + computerMove);
        if(yourMove.equals(computerMove)){
            System.out.println("This round is tie.");
            tie++;
        }

        if(yourMove.equals("Rock")){
            if(computerMove.equals("Paper")) {
                System.out.println("Computer wins this round!");
                computerPoints++;
            }
            else if(computerMove.equals("Scissor")) {
                System.out.println("You win this round!");
                yourPoints++;
            }
        }
        if(yourMove.equals("Paper")) {
            if (computerMove.equals("Scissor")) {
                System.out.println("Computer wins this round!");
                computerPoints++;
            }
            else if (computerMove.equals("Rock")) {
                System.out.println("You win this round!");
                yourPoints++;
            }
        }
        if(yourMove.equals("Scissor")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You win this round!");
                    computerPoints++;
                }
                else if (computerMove.equals("Rock")) {
                    System.out.println("Computer wins this round!");
                    computerPoints++;
                }
        }
        i++;
        }

        System.out.println("Tie matches: " + tie);
        System.out.println("Your points: " + yourPoints);
        System.out.println("Computer points: " + computerPoints);

        if (yourPoints > computerPoints){
            System.out.println("You win the match with " + (yourPoints - computerPoints) + " Points." );
        }
        else if(computerPoints > yourPoints){
            System.out.println("Computer win the match with " + (computerPoints - yourPoints) + " Points." );
        }
        else {
            System.out.println("\nMatch Draw!");
        }
    }
}
