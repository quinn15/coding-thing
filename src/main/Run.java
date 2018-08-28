package main;

public class Run {

	public static String word = "pneumonoultramicroscopicsilicovolcanoconiosis";
	public static int paradox = 6;
	
	public static void main(String[] args) {
		say(word);
		word = "team fortress 2";
		say(word);
		System.out.println(paradox);
		System.out.println(add(paradox));
	}
	
	public static void say(String in) {
		System.out.println(in);
	}
	
	public static int add(int zello) {
		return zello + 1;
	}
	
}
