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
    
    public ArrayList<Player> getPlayers() 
    {
        return players;
    }

    @Override
    public void play() {

    }
    public void computeValue()
    {
        Card[] cardHand = GroupOfCards.generateHand(2);
        int number1 = 0;
        for(Card card : cardHand)
        {
            switch(card.getValue())
            {
                case TWO:
                    number1 = 2;
                    break;

                case THREE:
                    number1 = 3;
                    break;

                case FOUR:
                    number1 = 4;
                    break;

                case FIVE:
                     number1 = 5;
                     break;

                case SIX:
                     number1 = 6;
                     break;

                case SEVEN:
                     number1 = 7;
                     break;

                case EIGHT:
                     number1 = 8;
                     break;

                case NINE:
                     number1 = 9;
                     break;

                case TEN:
                     number1 = 10;
                     break;
            }
        }
    }//end of computeValue method
}
