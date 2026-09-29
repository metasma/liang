class Main {
	public static void main(String[] args) {

		System.out.println("Miles	Kilometers" + "   |   " + "Miles	Kilometers");

		for (int i = 1; i < 11; i++) {
			System.out.println();
			System.out.print(i + "	" + i * 1.609);
			System.out.print("   |   " + (15 + i * 5) + "	" + (15 + i * 5) / 1.609);
		}

	}
}
