package by.epam.unit02.main;

public class Task03 {
	public static void main (String[] args) {
		int T = 36000;
		int hour, min, sec;
		int numberOfSeconds;
		numberOfSeconds = T;
		
		if (T > 0) {
			hour = T / 3600;
			T = T - hour * 3600;
			min = T / 60;
			sec = T;
			
			System.out.println("Значение в секундах " + numberOfSeconds);
			System.out.printf("%02dч %02dmin %02dc", hour, min, sec);
		}
		else {
			System.out.println("Неверное число. Нужно ввести положительное число");
		}
	}
}
