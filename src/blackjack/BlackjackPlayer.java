/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
           else if(decision == 2)
           {
               Draw();
           }           
    }
    public void ask()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to restart the game?");
        System.out.println("Type yes or no");
        int choice = input.nextInt();
        
        if(choice == 1)
        {
            System.out.println("Game continuing...");
        }
        else if(choice == 0)
        {
            System.out.println("Game ending");
        }     
    }
}
