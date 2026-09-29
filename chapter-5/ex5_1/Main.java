import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		int positive = 0;
		int negative = 0;
		int total = 0;
		int average = 0;
		int iteration = 0;

		Scanner input = new Scanner(System.in);

		int current = 0;

		do {
			current = input.nextInt();

			if (current > 0) {
				positive++;
			}
			else if (current < 0) {
				negative++;
			}

			total += current;
			iteration++;
		}
		while (current != 0);

		System.out.println("positive numbers - " + positive);
		System.out.println("negative numbers - " + negative);
		System.out.println("total sum is - " + total);
		System.out.println("average is - " + (double)total/--iteration);

	}
}
