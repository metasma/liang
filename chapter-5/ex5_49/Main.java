import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		
		var input = new Scanner(System.in);
		int vowels = 0;

		String customText = input.nextLine();
		
		for (int i = 0; i < customText.length(); i++) {

			switch (customText.charAt(i)) {
				case 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> {
					vowels++;
				}
			}
		}

		System.out.println(vowels);
	}
}
