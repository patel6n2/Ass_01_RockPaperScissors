import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playA = "";
        String playB = "";
        String playAgain = "";
        boolean done = false;
        do
        {
            do
            {
                System.out.print("Enter Player A's move [RPS]: ");
                playA = in.nextLine();
                if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else
                {
                    System.out.println(playA + " is not a valid move [RPS]");
                }
            } while (!done);
            done = false;
            do
            {
                System.out.print("Enter Player B's move [RPS]: ");
                playB = in.nextLine();
                if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else
                {
                    System.out.println(playB + " is not a valid move [RPS]");
                }
            } while (!done);
            done = false;
            if (playA.equalsIgnoreCase("R"))
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock all around, it's a tie!");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper covers rock, Player B wins!");
                }
                else
                {
                    System.out.println("Rock crushes scissors, Player A wins!");
                }
            }
            else if (playA.equalsIgnoreCase("P"))
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Paper covers rock, Player A wins!");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Paper all around, it's a tie!");
                }
                else
                {
                    System.out.println("Scissors cuts paper, Player B wins!");
                }
            }
            else
            {
                if (playB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock crushes scissors, Player B wins!");
                }
                else if (playB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts paper, Player A wins!");
                }
                else
                {
                    System.out.println("Scissors all around, it's a tie!");
                }
            }
            do
            {
                System.out.print("Do you want to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    done = true;
                }
                else
                {
                    System.out.println(playAgain + " is not a valid option [Y/N]");
                }
            } while (!done);
            done = false;
        } while (playAgain.equalsIgnoreCase("Y"));
    }
}