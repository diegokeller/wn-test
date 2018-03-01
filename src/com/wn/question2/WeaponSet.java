package com.wn.question2;

import java.util.LinkedHashSet;
import java.util.Set;

import com.wn.question2.weapons.BaseballBat;
import com.wn.question2.weapons.BowAndArrow;
import com.wn.question2.weapons.Katana;
import com.wn.question2.weapons.Revolver;
import com.wn.question2.weapons.Weapon;

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
