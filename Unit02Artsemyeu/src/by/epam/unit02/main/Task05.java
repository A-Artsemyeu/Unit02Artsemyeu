package by.epam.unit02.main;
import static java.lang.Math.*;

public class Task05 {
	public static void main (String[] args) {
		double x = 120.01;
		double y = 140.05;
				
		double rezultat = (sin(x) + cos(y) / (cos(x) - sin(y)) * tan(x * y));
		
		System.out.println("The value of the expression is exactly - " + rezultat);
		
	}
}
