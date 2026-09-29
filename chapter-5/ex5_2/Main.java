import java.util.Scanner;
import java.time.LocalTime;

class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		int dividend = 0;
		int divisor = 0;

		int points = 0;
		int wrong = 0;

		Scanner input = new Scanner(System.in);

		LocalTime start = LocalTime.now();

		for (int i = 0; i < 15; i++) {

			dividend = (int)(1 + (Math.random() * 15));
			divisor = (int)(1 + (Math.random() * 15));

			System.out.println(dividend + " - " + divisor + " = ");
			int answer = input.nextInt();

			if (answer == dividend - divisor) {
				points++;
			}
			else {
				wrong++;
			}
		}
		
		LocalTime end = LocalTime.now();

		LocalTime difference = end.minusHours(start.getHour());
		difference = difference.minusMinutes(start.getMinute());
		difference = difference.minusSeconds(start.getSecond());

		System.out.println("total time taken - " + difference);

		System.out.println("Total points are - " + points + ", wrong answers are - " + wrong);
	}
}
