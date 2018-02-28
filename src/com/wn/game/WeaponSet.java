package com.wn.game;

import java.util.LinkedHashSet;
import java.util.Set;

import com.wn.game.weapons.BaseballBat;
import com.wn.game.weapons.BowAndArrow;
import com.wn.game.weapons.Katana;
import com.wn.game.weapons.Revolver;
import com.wn.game.weapons.Weapon;

public class WeaponSet {
	
	private static Set<Weapon> weapons = null;
	
	public static Set<Weapon> getWeapons() {
	
		if(weapons == null) {
			weapons = new LinkedHashSet<Weapon>();
			weapons.add(new BaseballBat());
			weapons.add(new BowAndArrow());
			weapons.add(new Katana());
			weapons.add(new Revolver());
		}
		
		return weapons;
	}

}
