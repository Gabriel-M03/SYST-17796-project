package blackjack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import blackjack.Card.Value;
import blackjack.Card.Suit;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 */
public class GroupOfCards 
{

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size = 2;//the size of the grouping

    public GroupOfCards(int size) 
    {
        this.size = size;
    }
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    public static Card[] generateHand(int handSize) {
        
        // we'll use this to generate random numbers
        Random random = new Random();
        
        // let's get these lengths once
        int numValues = Card.Value.values().length;
        int numSuits = Card.Suit.values().length;
        
        // declare and initialize a hand of cards
        Card[] hand = new Card[handSize];
        
        for (int i = 0; i < handSize; i++) {
            
            // get a random suit and value. Note we're not concerned about uniqueness
            // at this point
            Suit randomSuit = Card.Suit.values()[random.nextInt(numSuits)];
            Value randomValue = Card.Value.values()[random.nextInt(numValues)];
            
            // create a card and add it to the hand
            PlayingCard card = new PlayingCard(randomSuit, randomValue);        
            hand[i] = card;
            
        }      
        return hand;
    }
}//end class
