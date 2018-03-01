package com.wn.question2;

import java.util.HashSet;
import java.util.Set;

import com.wn.question2.characters.Character;
import com.wn.question2.characters.Daryl;
import com.wn.question2.characters.Michonne;
import com.wn.question2.characters.Negan;
import com.wn.question2.characters.Rick;

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
