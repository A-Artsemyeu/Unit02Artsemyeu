package by.epam.unit02.main;

public class Task07 {
	public static void main (String[] args) {
		double a, b, c, x, y, z;
		a = -56;
		b = 324;
		c = 245;
		
			if (a >= 0) {
				x = Math.pow(a, 2);
			} else {
				x = Math.pow(a, 4);
			}
			
			if (b >= 0) {
				y = Math.pow(b, 2);
			} else {
				y = Math.pow(b, 4);
			}
			
			if (c >= 0) {
				z = Math.pow(c, 2);
			} else {
				z = Math.pow(c, 4);
			}
			System.out.println("a = " + a + "  in pow = " + x + "\n" + "b = " + b + "  in pow = " + y + "\n" + "c = " + c + " in pow = " + z );
		}
	}
