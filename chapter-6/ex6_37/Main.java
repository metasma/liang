import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		var input = new Scanner(System.in);
		var userInt = input.nextInt();
		var userWidth = input.nextInt();

		System.out.println(format(userInt, userWidth));
		System.out.println(customFormat(userInt, userWidth));
	}

	public static String format(int number, int width) {

		return String.format("%0" + width + "d", number);
	}

	public static String customFormat(int number, int width) {

		String numberString = String.valueOf(number);
		String zeros = "";

		if (width < numberString.length()) {
			return numberString;
		}
		
		for (int i = 0; i < width - numberString.length(); i++) {

			zeros += "0";
		}

		return zeros + numberString;
	}
}
