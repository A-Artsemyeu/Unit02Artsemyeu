package by.epam.unit02.main;

public class Task02 {
	public static void main (String[] args) {
		int x, y, rez;
		
		x = 1;
		y = 100; 
		
		if (x < y) {
			rez = y;
			y = x; 
			x = rez;
		}
		System.out.println("x: " + x + "\ny: " + y);
	}
	
}
