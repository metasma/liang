import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		var input = new Scanner(System.in);
		int prompt = input.nextInt();

		System.out.println(reverse(prompt));

		System.out.println(isPalindrome(prompt));
	}

	public static int reverse(int number) {

		int result = 0;

		while (number % 10 > 0 || number / 10 > 0) {

			result *= 10;
			result += number % 10;
			
			number /= 10;
		}

		return result;
	}

	public static boolean isPalindrome(int number) {
		return number == reverse(number);
	}
}
