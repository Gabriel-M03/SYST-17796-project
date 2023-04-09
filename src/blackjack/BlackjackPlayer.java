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
    }
    
    @Override
    public void Stand()
    {}
    
    public void play()
    {      
           Scanner input = new Scanner(System.in);
           BlackjackPlayer black = new BlackjackPlayer(name);
           System.out.println("Player " + (i+1) + ", do you want to stand or draw");
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
    
    
}
