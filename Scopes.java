package ch2B_1inclass;



public class Scopes {
	static int second = 4;
	final int COUNTDOWN = 26.7;
	public int third = 9
	public static void main(String[] args) {
		int COUNTDOWN = 32;
		int first = 3;
		System.out.println(first);
		int first = first + 7;
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
