/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ltmer
 */
public class Player {
    
    ArrayList<Card> hand = new ArrayList<Card>();
    
    //Returns amount of cars in players hand
    public int handSize(){
       return hand.size();
    }
    
    //Prints the cards in players hand (for testing)
    public void printHand(){
        System.out.println(hand);
    }
    
    //Shuffels players cards (Won't use for this game)
    public void shuffle(){
        Collections.shuffle(hand);
    }
    
    //Removes top card from player hand and returns value
    public Card getTopCard(){
        
        return hand.remove(0);
        
    }
    
    //adds a card to the players hand
    public void addCard(Card c){  
        hand.add(c);
    }
    
}
    
