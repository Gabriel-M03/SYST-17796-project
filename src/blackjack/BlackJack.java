package blackjack;
import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack 
{

    static int result;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Welcome to Blackjack! Let's start!");
        System.out.println("How many Players are playing?");
        Scanner input = new Scanner(System.in);
        int noOfPlayers = input.nextInt();
        boolean a = true;
        //int number1 = 0;
        String name = " ";
        BlackjackPlayer black = new BlackjackPlayer(name);
        do
        {
            if(noOfPlayers >= 5)
            {
                System.out.println("Players cannot be more than 5, Enter a number again");
                noOfPlayers = input.nextInt();
            }
        }
       while(noOfPlayers >= 5);
       do
       {
            for(int i=0;i<noOfPlayers;i++)//Base settings for players 
            {
                System.out.println("Enter name of Player " + (i+1));
                name = input.next();
                BlackjackPlayer player = new BlackjackPlayer(name);
                players.add(player);  
                System.out.println();
                System.out.println(players.get(i).getName() + ", " + "how much are you willing to bet?");
                int bet = input.nextInt();
                if (bet > Bank.getBet())
                {
                    System.out.println("You cannot bet higher than your bank amount, try again");
                    bet = input.nextInt();
                }
                if (bet < 50)
                {
                    System.out.println("You cannot bet lower than the minimum amount of 50, try again");
                    bet = input.nextInt();
                }    

                //Players given cards
                System.out.println();
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
                PlayGame game = new PlayGame(name);//Object call
                int result = game.computeValue(cardHand);//Method call to compute the total value of the players deck
                //int result = game.handValue;
                System.out.println();
                System.out.println(players.get(i).getName() + "'s deck value: " + result);

                System.out.println();

                black.play();

             }//End of player for loop
             Card[] cardHand = GroupOfCards.generateHand(1);
             PlayGame game = new PlayGame(name);
             int result = game.computeValue(cardHand);
             System.out.println("Dealer is given:");
             for (Card card : cardHand) 
             {
                 System.out.println(card.getValue() + " of " + card.getSuit());
                 System.out.println("Dealer's deck value is: " + result);
             }       
             //This is for the turn of the players
             if(black.ask())
             {}
             else
             {
                 break;
             }
        }//end of main do
       while(a = true);
    }//End of Main method
}//End of mmain
