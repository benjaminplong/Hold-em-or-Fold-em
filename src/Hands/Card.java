/*
 * Card class to represent a standard playing card
 */
package Hands;

import Hands.Enums.Value;
import Hands.Enums.Suit;

public class Card {

private Value value;
private Suit suit;

	//Constructor can be edited based on what we want to pass,
	//or we can write multiple constructors
	Card(Value newValue, Suit newSuit){
		value = newValue;
		suit = newSuit;
	}
	
	Value getValue(){
		return value;
	}
	
	Suit getSuit(){
		return suit;
	}


}
