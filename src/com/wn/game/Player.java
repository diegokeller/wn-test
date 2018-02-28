package com.wn.game;

import com.wn.game.characters.Character;

public class Player {
	
	private String name;
	private Character character;
	
	public Player(String name) {
		super();
		this.name = name;
	}

	public void chooseCharacter(Character character) {
		this.character = character;
		character.changeWeapon();
	}
	
	public void pressA() {
		System.out.println("Player " + name + " press A");
		character.attack();
	}

	public void pressB() {
		System.out.println("Player " + name + " press B");
		character.changeWeapon();
	}
	
	public String getName() {
		return name;
	}

}
