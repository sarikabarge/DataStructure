package com.bridgeit.oops;
import com.bridgeit.oops.jsonfile.Queue;
public class DeckOfCardsQueue extends DeckOfCards
{
     public static void main(String[] args)
     {
    	 DeckOfCards refDeck=new DeckOfCards();
    	 refDeck.getCards();
    	 refDeck.shuffleCards();
    	 String[][] playerCards=refDeck.distribute(4,9);
    	 int i=1;
  	   for(String[] printCard:playerCards)
  	   {
  		   System.out.println();
  		   System.out.println("player "+i+" cards ");
  		   System.out.println(" ");
  		   i++;
  		   for(String showCard:printCard)
  		   {
  		      Queue<String> value=new Queue<String>(printCard.length);
  		      value.enQueue(showCard);
  		      value.show();
  		   }
  		   System.out.println("  ");
  	   }
	 }
}
