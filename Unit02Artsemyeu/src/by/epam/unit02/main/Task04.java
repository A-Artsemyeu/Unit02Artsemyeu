package by.epam.unit02.main;

public class Task04 {
	public static void main (String[] args) {
		int x1 = 78;
		int x2 = 107;
		int y1 = 25;
		int y2 = 45;
		
		double rezult1 = x2 - x1;
		double rezult2 = y2 - y1;
		
		
		double distance = Math.sqrt(Math.pow(rezult1, 2) + Math.pow(rezult2, 2));
		System.out.println("Distance between two points is " + distance);
	}
}
