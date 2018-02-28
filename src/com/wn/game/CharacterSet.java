package com.wn.game;

import java.util.HashSet;
import java.util.Set;

import com.wn.game.characters.Character;
import com.wn.game.characters.Daryl;
import com.wn.game.characters.Michonne;
import com.wn.game.characters.Negan;
import com.wn.game.characters.Rick;

public class CharacterSet {

	private static Set<Character> characters = null;

	public static Set<Character> getCharacters() {

		if (characters == null) {
			characters = new HashSet<>();
			characters.add(new Daryl());
			characters.add(new Michonne());
			characters.add(new Negan());
			characters.add(new Rick());
		}

		return characters;
	}

}
