/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
/** 
 * username: sindigvi
 * firstname: digvijay singh 
 * this is my branch file - I have completed the code to create 7 random files
 */
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Sivagama 
 */
public class CardTrick {
  
   public static void main(String[] args) {

       Card[] magicHand = new Card[7];
       Random ran = new Random();
       for(int i=0;i<magicHand.length;i++)
       {
           Card c = new Card();
          
           c.setValue(ran.nextInt(13)+1); // randomly generate a value between [1,13]
           c.setSuit(Card.SUITS[ran.nextInt(4)]); // randomly generate a number between [0,3] and get the String stores in SUITS array in that index
           magicHand[i] = c; // set ith card of magicHand to c
       }
      
       boolean found = false;
       // create a luckyCard
       Card luckyCard = new Card();
       luckyCard.setValue(9);
       luckyCard.setSuit(Card.SUITS[2]);
      
       // loop to determine if luckyCard is present in magicHand
       for(int i=0;i<magicHand.length;i++)
       {
           if(magicHand[i].getValue() == luckyCard.getValue() && magicHand[i].getSuit().equalsIgnoreCase(luckyCard.getSuit()))
           {
               found = true;
               break;
           }
       }
      
       // display the result based on the search
       if(found)
           System.out.println("Lucky card found in magicHand");
       else
           System.out.println("Lucky card not found in magicHand");
   }

}

//end of CardTrick.java