package main;

import main.test.Imp;
import main.test.Stuff;

public class Run {

	public static String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
	public static int paradox = 5;
	public static Imp imp1 = new Imp();
	public static Imp imp2 = new Imp();
	public static Gun ak47 = new Gun(6, 20);
	
	public static void main(String[] args) {
		say(word);
		word = "team fortress 2";
		say(word);
		System.out.println(paradox);
		System.out.println(add(paradox));
		Stuff.fellow();
		imp2.pool = 1;
		System.out.println(imp1.pool);
		System.out.println(imp2.pool);
	}
	
	public static void say(String in) {
		System.out.println(in);
	}
	
	public static int add(int zello) {
		
		if (zello == 5) {
			return 79;
		} else {
			return zello + 1;
		}
	}
	
}
