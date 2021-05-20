package by.epam.unit02.main;

public class Task06 {
	public static void main (String[] args) {
		
		int m = 5135;
		int n = 1436;
		
		double rezult = (double)m / n;
		System.out.println("Result is " + rezult);
		
		int yongerNumber = (int)rezult % 10;
		int olderNumber = (int)(rezult * 10) % 10;
		
		System.out.println("Yonger number is " + yongerNumber );
		System.out.println("Older number is " + olderNumber );
		
	}
}
