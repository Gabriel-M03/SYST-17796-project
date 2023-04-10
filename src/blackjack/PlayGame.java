package blackjack;

import java.util.ArrayList;

/**
 *
 * @author black
 */
public class PlayGame extends Game
{
    protected ArrayList<Player> players;
    
    public PlayGame(String name)
    {
        super(name);
    }
    
    public void setPlayers(ArrayList<Player> players) 
    {
        this.players = players;
    }
    
    @Override
    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    @Override
    public void play() {
        BlackJack game = new BlackJack();
        
        int dealerResult = 0; 
        Card[] dealerHand = GroupOfCards.generateHand(1);
        PlayGame dealerGame = new PlayGame("Dealer");
        dealerResult = dealerGame.computeValue(dealerHand);
                
        for (Player player: players)
        {
            int playerResult = BlackJack.result;
        if (playerResult == 21)
        {System.out.print(player.getName() + " BlackJack! ");}
        if (dealerResult == 21)
        {System.out.print("Dealer BlackJack!");}
        
        if (playerResult > 21)
        {System.out.println(player.getName() + " busted! Dealer wins!");
          //  int balance = Bank.getBalance - Bank.getBet();
        }
        else if (dealerResult > 21)
        {System.out.println("Dealer busted! " + player.getName() + " wins!");}
        else if (playerResult > dealerResult)
        {System.out.println(player.getName() + " wins!");}
        else if (playerResult == dealerResult)
        {System.out.println(player.getName() + " and Dealer tie.");}
        else {System.out.println("Dealer wins!");}
        }
    }
    
    public int computeValue(Card[] cardHand)
    {
        //Card[] cardHand = GroupOfCards.generateHand(2);
        //Card[] cardHand = BlackJack.cardHand;
        int handValue = 0;
        int acesInHand = 0;
        for(Card card : cardHand)
        {
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
        }
        
      //ACE special value logic
      for (int i=0; i< acesInHand; i++)
      {
          if(handValue <=10)
          {
              handValue +=11;
          }
          else 
          {
              handValue +=1;
          }
      }
      //check if more than 1 ACE and value is greater than 21
      if (handValue > 21 && acesInHand > 0)
      {
        handValue -=10;
      }
//      if (handValue == 21)
//      {
//          System.out.println("BlackJack!");
//      }
//      if (handValue > 21)
//      {
//          System.out.println("Hand Busted!");
//      }
      return handValue;
    }
    @Override
    public void declareWinner()
    {
        
    }
}
     //end of computeValue method

