import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		var input = new Scanner(System.in);

		System.out.println("Enter the first string: ");
		String customTextOne = input.nextLine();
		var textScannerOne = new Scanner(customTextOne);

		System.out.println("Enter the second string: ");
		String customTextTwo = input.nextLine();
		var textScannerTwo = new Scanner(customTextTwo);

		String result = "";

		while (textScannerOne.hasNext() && textScannerTwo.hasNext()) {

			String first = textScannerOne.next();
			String second = textScannerTwo.next();

			if (first.equals(second)) result += first + " ";
		}

		System.out.println(result);
	}
}
