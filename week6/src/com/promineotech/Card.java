package com.promineotech;

//Create the following classes:
//a. Card
	//i. Fields
		//1. value (contains a value from 2-14 representing cards 2-Ace)
		//2. name (e.g. Ace of Diamonds, or Two of Hearts)
	//ii. Methods
		//1. Getters and Setters
		//2. describe (prints out information about a card)

public class Card {
	
	private int value=0;
	private String name="";
	
	public Card()
	{
		
	}
	
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println("name: " + this.name);
		System.out.println("value: " + this.value);
		
		//System.out.println(this.name + " of " + this.value);
		
	}
	
}
