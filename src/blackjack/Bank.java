package blackjack;

/**
 *
 * @author black
 */
public class Bank 
{

    /**
     * @return the bet
     */
    public static int getBet() {
        return bet;
    }

    /**
     * @param bet the bet to set
     */
    public void setBet(int bet) {
        this.bet = bet;
    }
    private static int bet = 250;
    private static int balance = 250;

    /**
     * @return the balance
     */
    public static int getBalance() {
        return balance;
    }

    
}
