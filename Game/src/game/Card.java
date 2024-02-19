/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author ltmer
 */

public class Card{
    
    private int suit, value;
    private String[] cardSuit = {"Spades", "Diamonds", "Hearts", "Clubs"};
    private String[] cardValue = {"Ace", "King", "Queen", "Jack", "10",
    "9", "8", "7", "6", "5", "4", "3", "2"};

    public Card(int cSuit, int cValue) {
        suit = cSuit;
        value = cValue;
    }

    //Give card in toString format (for testing)
    public String toString() {
        String cardInfo = cardValue[value] + " of " + cardSuit[suit];

        return cardInfo;
    }
    
    //Get an image of the card
    public String getImage(){
        
        String imgName = "/images/"+cardValue[value]+cardSuit[suit]+".png";
        return imgName;
    }
    
    //Gives the play value of card
    public int getValue(){
        
        int x;
        
        //Checks for facecards first and assings value to x; if not a facecard, parses the card value and assigns to x
        switch (cardValue[value]) {
            case "Ace":
                x=1;
                break;
            case "King":
                x=13;
                break;
            case "Queen":
                x=12;
                break;
            case "Jack":
                x=11;
                break;
            default:
                x = Integer.parseInt(cardValue[value]);
                break;
        }
        
        //Returns value of card
        return x;
    }

    
}
