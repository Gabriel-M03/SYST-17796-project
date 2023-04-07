package blackjack;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Card> cards = new ArrayList<>();
        System.out.println("Welcome to Blackjack! Let's start!");
        System.out.println("How many Players are playing?");
        Scanner input = new Scanner(System.in);
        int noOfPlayers = input.nextInt();
        do
        {
            if(noOfPlayers >= 5)
            {
                System.out.println("Players cannot be more than 5, Enter a number again");
                noOfPlayers = input.nextInt();
            }
        }
       while(noOfPlayers >= 5);
        for(int i=0;i<noOfPlayers;i++)//Base settings for players 
        {
            System.out.println("Enter name of Player " + (i+1));
            String name = input.next();
            BlackjackPlayer player = new BlackjackPlayer(name);
            players.add(player);  
            System.out.println(players.get(i).getName() + ", " + "how much are you willing to bet?");
            int bet = input.nextInt();
            if (bet > Bank.getBet())
            {
                System.out.println("You cannot bet higher than your bank amount, try again");
                bet = input.nextInt();
            }
            //Players given cards
            System.out.println(players.get(i).getName() + " is given: ");
            Card[] cardHand = GroupOfCards.generateHand(2);
            if(cardHand == cardHand)
            {
                System.out.println("Identical cards given - reshuffling");
                for (Card card : cardHand) 
                {
                    System.out.println(card.getValue() + " of " + card.getSuit());
                }
            }
            else
            {   
                System.out.println("No duplicates - continuing");
                for (Card card : cardHand) 
                {
                    System.out.println(card.getValue() + " of " + card.getSuit());
                }  
            }
        }
        //Dealer is given card
        System.out.println("\nDealer is given:");
        Card [] cardHand = GroupOfCards.generateHand(1);
        for (Card card : cardHand) 
        {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }
}
