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
}
