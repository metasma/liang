class Main {
	public static void main(String[] args) {

		double lToR = 0;
		double rToL = 0;

		for (int i = 1; i < 50001; i++) {
			lToR += (double)1/i;
			rToL += (double)1/(50001 - i);
		}

		System.out.println(lToR + " - left to right.");
		System.out.println(rToL + " - right to left.");
	}
}
