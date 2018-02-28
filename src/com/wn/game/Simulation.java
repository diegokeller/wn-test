package com.wn.game;

public class Simulation {

	public static void main(String[] args) {
		
		// Creates a new player
		Player player = new Player("Jhon");
		
		// Chooses any character
		player.chooseCharacter(CharacterSet.getCharacters().iterator().next());
		
		// Simultes the game
		for(int i = 0; i <= 5; i++) {
			player.pressA();
			player.pressA();
			
			player.pressB();
		}
		
	}
	
}
