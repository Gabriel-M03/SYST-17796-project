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
        System.out.println("How many Players are playing? ");
        Scanner input = new Scanner(System.in);
        int noOfPlayers = input.nextInt();
        boolean a = true;
        String name = " ";
        BlackjackPlayer black = new BlackjackPlayer(name);
        PlayGame game = new PlayGame(name);
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
                System.out.println("Enter name of Player " + (i+1) + ": ");
                name = input.next();
                BlackjackPlayer player = new BlackjackPlayer(name);
                players.add(player);  
                System.out.println();
                System.out.println(players.get(i).getName() + ", " + "how much are you willing to bet? ");
                int bet = input.nextInt();
                if (bet > Bank.getBet())
                {
                    System.out.println("You cannot bet higher than your bank amount, try again: ");
                    bet = input.nextInt();
                }
                if (bet < 50)
                {
                    System.out.println("You cannot bet lower than the minimum amount of 50, try again: ");
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
                int result = game.computeValue(cardHand);//Method call to compute the total value of the players deck
                //int result = game.handValue;
                System.out.println();
                System.out.println(players.get(i).getName() + "'s deck value: " + result);

                System.out.println();
                player.setCardHand(cardHand);
            }//End of player for loop
            Card[] cardHand = GroupOfCards.generateHand(1);
            int result = game.computeValue(cardHand);
            System.out.println("Dealer is given:");
            for (Card card : cardHand) 
            {
                System.out.println(card.getValue() + " of " + card.getSuit());
                System.out.println("Dealer's deck value is: " + result);
                //if (result <17)
                  //black.Draw();
                //else 
                  black.Stand();
             }
            
            black.play();
            //PlayGame game = new PlayGame (name);
            //This is for the turn of the players
            int dealerResult; 
            Card[] dealerHand = GroupOfCards.generateHand(1);
            PlayGame dealerGame = new PlayGame("Dealer");
            dealerResult = dealerGame.computeValue(dealerHand);

            System.out.println();
            System.out.println("Game Results:");
            for (Player player: players)
            {
                int playerResult = BlackJack.result;
                int balance;
                if (playerResult == 21)
                {System.out.print(player.getName() + " BlackJack! ");}
                if (dealerResult == 21)
                {System.out.print("Dealer BlackJack!");}

                if (playerResult >= 21)
                {
                    System.out.println(player.getName() + " busted! Dealer wins!");
                    balance = Bank.getBalance() - Bank.getBet();
                    Bank.setBalance(balance);
                }
                else if (dealerResult >= 21)
                {
                    System.out.println("Dealer busted! " + player.getName() + " wins!");
                }
                else if (playerResult <= dealerResult)
                {
                    System.out.println(player.getName() + " wins!");
                }
                else if (playerResult == dealerResult)
                {
                    System.out.println(player.getName() + " and Dealer tie.");
                    balance = Bank.getBalance() - Bank.getBet();
                    Bank.setBalance(balance);
                }
                else 
                {
                    System.out.println("Dealer wins!");
                    balance = Bank.getBalance() - Bank.getBet();
                    Bank.setBalance(balance);
                }        
            }//End of for loop for final score
            if(black.ask())
            {}
            else
            {
                game.declareWinner();
                break;
            }
        }//end of main do
        while(a = true);
        int dealerResult; 
        Card[] dealerHand = GroupOfCards.generateHand(1);
        PlayGame dealerGame = new PlayGame("Dealer");
        dealerResult = dealerGame.computeValue(dealerHand);
        
        System.out.println();
        System.out.println("Final Game Results:");
        for (Player player: players)
        {
            int playerResult = BlackJack.result;
            int balance;
            if (playerResult == 21)
            {System.out.print(player.getName() + " BlackJack! ");}
            if (dealerResult == 21)
            {System.out.print("Dealer BlackJack!");}

            if (playerResult >= 21)
            {
                System.out.println(player.getName() + " busted! Dealer wins!");
                balance = Bank.getBalance() - Bank.getBet();
                Bank.setBalance(balance);
            }
            else if (dealerResult >= 21)
            {
                System.out.println("Dealer busted! " + player.getName() + " wins!");
            }
            else if (playerResult < dealerResult)
            {
                System.out.println(player.getName() + " wins!");
            }
            else if (playerResult == dealerResult)
            {
                System.out.println(player.getName() + " and Dealer tie.");
                balance = Bank.getBalance() - Bank.getBet();
                Bank.setBalance(balance);
            }
            else 
            {
                System.out.println("Dealer wins!");
                balance = Bank.getBalance() - Bank.getBet();
                Bank.setBalance(balance);
            }        
        }//End of for loop for final score
    }//End of Main method
}//End of mmain
