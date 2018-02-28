package com.wn.game.characters;

import java.util.Iterator;

import com.wn.game.WeaponSet;
import com.wn.game.weapons.Weapon;

public abstract class Character {

	private Weapon currentWeapon;
	private Iterator<Weapon> weaponIterator;
	
	public void attack() {
		System.out.println("Character attacks");
		currentWeapon.fire();
		System.out.println("");
	}
	
	public void changeWeapon() {
		System.out.println("Character changes weapon");
		if(weaponIterator == null || !weaponIterator.hasNext()) {
			weaponIterator = WeaponSet.getWeapons().iterator();
		}
		currentWeapon = weaponIterator.next();
		System.out.println("New weapon: " + currentWeapon.getClass().getSimpleName());
		System.out.println("--------------------------------");
		System.out.println("");
	}
	
	public Weapon getCurrentWeapon() {
		return currentWeapon;
	}
	
}
