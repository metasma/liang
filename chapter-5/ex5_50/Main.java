import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		int upperCount = 0;

		var input = new Scanner(System.in);
		String customText = input.nextLine();

		for (int i = 0; i < customText.length(); i++) {
			if (Character.isUpperCase(customText.charAt(i))) {
				upperCount++;
			}
		}

		System.out.println(upperCount);
	}
}
