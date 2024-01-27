package com.promineotech;

import java.util.ArrayList;
import java.util.List;

//c.Player
//i. Fields
	//1. hand (List of Card)
	//2. score (set to 0 in the constructor)
	//3. name
//ii. Methods
	//1. describe (prints out information about the player and calls the describe
	//method for each card in the Hand List)
	//2. flip (removes and returns the top card of the Hand)
	//3. draw (takes a Deck as an argument and calls the draw method on the deck,
	//adding the returned Card to the hand field)
	//4. incrementScore (adds 1 to the Player’s score field)

public class Player {
    private List<Card> hand = new ArrayList<>();
    private int score = 0;
    private String name="";
  
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setScore(int score) {
		this.score = score;
	}

	public Player(String name) {
        this.name = name;
    }
	
    public int getScore() {
        return score;
    }

    public Player() {
    
    }
    
    
	//1. describe (prints out information about the player and calls the describe
	//method for each card in the Hand List)
	public void describe() {
        
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            card.describe();
        }
    }

	//2. flip (removes and returns the top card of the Hand)
    public Card flip() {
        return hand.remove(0);
    }
    
	//3. draw (takes a Deck as an argument and calls the draw method on the deck,
	//adding the returned Card to the hand field)
    public void draw(Deck deck) {
        hand.add(deck.draw());
    }
    
	//4. incrementScore (adds 1 to the Player’s score field)
    public void incrementScore() {
        score++;
    }

	
}
