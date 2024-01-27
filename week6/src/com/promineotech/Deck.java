package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create the following classes:
//Deck
//	i. Fields
//		1. cards (List of Card)
//	ii. Methods
//		1. shuffle (randomizes the order of the cards)
//		2. draw (removes and returns the top card of the Cards field)
//		3. In the constructor, when a new Deck is instantiated, the Cards 
//		field should be populated with the standard 52 cards.

public class Deck {

	//	i. Fields
	//	1. cards (List of Card)
	private List<Card> cards = new ArrayList<Card>();

	//	3. In the constructor, when a new Deck is instantiated, the Cards 
	//	field should be populated with the standard 52 cards.
    public Deck() {
        String[] baraja = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] cardValue = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : baraja) {
            for (String numbers : cardValue) {
                int numberOfCard = getNumberOfCard(numbers);
                cards.add(new Card(numberOfCard, numbers + " of " + suit));
            }
        }
    }
   
    private int getNumberOfCard(String numbers) {
        
        if(numbers == "Ace")
        {
            return 14;
        }
        else if (numbers == "Jack")
        {
            return 11;
        }
        else if (numbers == "Queen")
        {
            return 12;
        }
        else if (numbers == "King")
        {
            return 13;
        }
        else
        {
        	//convert the input of the string value into an integer number
            return Integer.parseInt(numbers);
        }
         
    }
	

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	//	1. shuffle (randomizes the order of the cards)
	public void shuffle() {
		Collections.shuffle(this.cards);
	}

//	2. draw (removes and returns the top card of the Cards field)
	public Card draw() {
		return cards.remove(0);
	}
	
	
	
}
