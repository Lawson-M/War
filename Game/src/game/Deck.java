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


public class Deck {
    
    ArrayList<Card> deck = new ArrayList<Card>();
    
    public Deck(){
        
        Card c;
        
        for(int i=0; i<=3; i++){
            
            for(int j=0;j<=12;j++){
                c = new Card (i,j);
                deck.add(c);
            }                  
        }
        }
    
    public int deckSize(){
       return deck.size();

    }
    
    public void printDeck(){
        System.out.println(deck);
    }
    
    public void shuffle(){
        Collections.shuffle(deck);
    }
    
    public Card getTopCard(){
        
        return deck.remove(0);
        
    }
    
}
