package blackjack;
import java.util.Scanner;

public class BlackJack 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Blackjack! Let's start!");
        System.out.println("How many Players are playing?");
        Scanner input = new Scanner(System.in);
        int noOfPlayers = input.nextInt();
       if(noOfPlayers > 5)
       {
        System.out.println("Players cannot be more than 5, Enter a number again");
        noOfPlayers = input.nextInt();
       }
       else 
       {
           for(int i=0;i<noOfPlayers;i++)
           {
               System.out.println("Enter name of Player " + noOfPlayers);
               String name = input.next();
               Player player(i) = new Player;
               
           }
       }
       

    }
}
