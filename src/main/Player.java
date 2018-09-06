package main;

import main.util.Coordinate;

public class Player {

	public static Coordinate position = new Coordinate(0, 0);
	public static int health = 10000;
	public static int maxAmmo = 60;
	public static int ammo = maxAmmo;
	
	public static void takeDamage(int damage) {
		
		health = health - damage;
		
	}
	
	public static void shoot() {
		
		ammo = ammo - 1;
		
	}
}
