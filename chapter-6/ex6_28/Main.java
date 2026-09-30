class Main {
	public static void main(String[] args) {

		for (long i = 1; i < 32; ) {
			if (isPrime(getMersenneForm(i))) {
				System.out.println(i + " " + getMersenneForm(i));
			}
			i++;
		}
	}

        public static boolean isPrime(long number) {

                for (int i = 2; i < number; i++) {
                        if (number % i == 0 && number != i) return false;
                }

                return true;
        }

	public static long getMersenneForm(long n) {

		return (long)Math.pow(2, n) - 1;
	}
}
