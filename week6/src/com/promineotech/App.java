package com.promineotech;

//2. Create a class called App with a main method.
//a) Instantiate a Deck and two Players, call the shuffle method on the deck.
//b) Using a traditional for loop, iterate 52 times calling the Draw method on the other player each
	//iteration using the Deck you instantiated.
//c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
//d) Compare the value of each card returned by the two player’s flip methods. Call the
	//incrementScore method on the player whose card has the higher value.
//e) After the loop, compare the final score from each player.
//f) Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on
	//which score is higher or if they are both the same.

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//a) Instantiate a Deck and two Players, call the shuffle method on the deck.
		Deck deck = new Deck();
		Player player1 = new Player();
		player1.setName("Carlos");
		Player player2 = new Player("Azael");
		deck.shuffle();

		//b) Using a traditional for loop, iterate 52 times calling the Draw method on the other player each
		//iteration using the Deck you instantiated.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}

		//c) Using a traditional for loop, iterate 26 times and call the flip method for each player.
		//a) Using the Card describe() method when each card is flipped illustrates the game play.
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			player1.describe();
			Card player2Card = player2.flip();
			player2.describe();
			
			//d) Compare the value of each card returned by the two player’s flip methods. Call the
			//incrementScore method on the player whose card has the higher value.
			//b) Printing the winner of each turn adds interest.
			if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
				System.out.println("Player 1 Card " + player1Card.getName() + " Player 2 Card " + player2Card.getName());
				System.out.println("Player 1 wins ");
				System.out.println(" Player 1 score is: " + player1.getScore());
				
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
				System.out.println("Player 1 Card " + player1Card.getName() + " Player 2 Card " + player2Card.getName());
				System.out.println("Player 2 wins");
				System.out.println(" Player 2 score is: " + player2.getScore());

			}
		}
		
		//e) After the loop, compare the final score from each player.
		System.out.println("_______________________________________");
		System.out.println("            SUMMARY OF GAME            ");
		System.out.println("_______________________________________");
		System.out.println("Player 1 Score = " + player1.getScore());
		System.out.println("Player 2 Score = " + player2.getScore());
		
		//f) Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on
		//which score is higher or if they are both the same.
		  if (player1.getScore() > player2.getScore()) 
		  { 
			  System.out.println("Player 1 " + player1.getName() + " Wins"); 
		  } 
		  else if (player1.getScore() < player2.getScore()) 
		  { 
			  System.out.println("Player 2 " + player2.getName() +" Wins"); 
		  } else 
		  { 
				  System.out.println("It is a Draw "); 
		  }

	}

}
