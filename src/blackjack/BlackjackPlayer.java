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
        PlayGame game = new PlayGame(getName());
        for (Card card : hand) 
        {
            System.out.println();
            System.out.println("Card drawn: " + card.getValue() + " of " + card.getSuit());
            int handValue = 0;
            int acesInHand = 0;
            switch(card.getValue())
            {
                case TWO:
                    handValue += 2;
                    break;

                case THREE:
                    handValue += 3;
                    break;

                case FOUR:
                    handValue += 4;
                    break;

                case FIVE:
                     handValue += 5;
                     break;

                case SIX:
                     handValue += 6;
                     break;

                case SEVEN:
                     handValue += 7;
                     break;

                case EIGHT:
                     handValue += 8;
                     break;

                case NINE:
                     handValue += 9;
                     break;

                case TEN:
                     handValue += 10;
                     break;

                case JACK:
                case QUEEN:
                case KING:
                    handValue += 10;
                     break;

                case ACE:
                    acesInHand++;
                    break;               
            }
            int newDeck = handValue + game.computeValue(hand);
            System.out.println("New deck is: " + newDeck);
            System.out.println();
        }
    }
    
    @Override
    public void Stand()
    {}
    

    @Override
    public void play()
    {      
        Scanner input = new Scanner(System.in);
        PlayGame game = new PlayGame(getName());
        System.out.println("Player do you want to stand or draw");
        System.out.println("1 for stand, and 2 for draw: ");
        int decision = input.nextInt();
        if(decision == 1)
        {
            Stand();
            game.declareWinner();
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
        System.out.println();
        System.out.println("Do you want to restart the game?");
        System.out.println("Type 1 for yes or 0 for no: ");
        int choice = input.nextInt();
        boolean a = true;
        
        if(choice == 1)
        {
            System.out.println();
            System.out.println("Game continuing...");
            a = true;
        }
        else if(choice == 0)
        {
            System.out.println();
            System.out.println("Game ending");
            a = false;
        }   
        return a;
    }
}
