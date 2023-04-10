package blackjack;

import java.util.Scanner;

/**
 *
 * @author fnoko
 */
public class BlackjackPlayer extends Player
{ 
    public BlackjackPlayer(String name) 
    {
        super(name);
        String playerStatus = "Player";
    }
    

    @Override
    public void Draw()
    {
        Card [] hand = GroupOfCards.generateHand(1);
        for (Card card : hand) 
        {
            System.out.println("Player draws " + card.getValue() + " of " + card.getSuit());
        }
        //players.get(1).addCard(hand);
    }
    
    @Override
    public void Stand()
    {}
    

    @Override
    public void play()
    {      
           Scanner input = new Scanner(System.in);
           System.out.println("Player do you want to stand or draw");
           System.out.println("1 for stand, and 2 for draw");
           int decision = input.nextInt();
           if(decision == 1)
           {
               Stand();
           }
           if (BlackJack.result > 21)
           {
               Stand();
           }
           else if(decision == 2)
           {
               Draw();
           }           
    }
    public boolean ask()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to restart the game?");
        System.out.println("Type yes or no");
        int choice = input.nextInt();
        boolean a = true;
        
        if(choice == 1)
        {
            System.out.println("Game continuing...");
            a = true;
        }
        else if(choice == 0)
        {
            System.out.println("Game ending");
            a = false;
        }   
        return a;
    }
}
