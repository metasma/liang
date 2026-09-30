class Main {

	public static void main(String[] args) {

		for (int i = 2; i < 1000; i++) {
			if (!isPrime(i)) {
				continue;
			}
			int less = i - 2;
			int more = i + 2;

			if (isPrime(more)) {
				System.out.println(i + " " + more);
			}
		}
	}

        public static boolean isPrime(int number) {

                for (int i = 2; i < number; i++) {
                        if (number % i == 0 && number != i) return false;
                }

                return true;
        }
}
