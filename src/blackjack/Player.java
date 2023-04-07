package blackjack;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public abstract class Player 
{

    /**
     * @return the bet
     */
    public int getBet() {
        return bet;
    }

    /**
     * @param bet the bet to set
     */
    public void setBet(int bet) {
        this.bet = bet;
    }
    private String name; //the unique name for this player
    private int bet;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
        
    public Player(String name) 
    {
        this.name = name;
    }
    
    /**
     * @return the player name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) 
    {
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
    public abstract void play();
    
    public void Stand()
    {
        
    }
    public void Draw()
    {
        
    }
    public int Bet(int bet)
    {
        this.setBet(bet);
        return bet;
    }
}
