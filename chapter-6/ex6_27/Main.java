class Main {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 0; i < 100; ) {

			if (isEmirp(count)) {
				System.out.println(++i + " " + count);
			}
			
			count++;
		}
	}

	public static boolean isEmirp(int number) {

		if (isPrime(number) && isPrime(reverse(number))) return true;

		return false;
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

	public static boolean isPrime(int number) {

		for (int i = 2; i < number; i++) {
			if (number % i == 0 && number != i) return false;
		}

		return true;
	}
}
