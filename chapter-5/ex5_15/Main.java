class Main {
	public static void main(String[] args) {
		
		for (char i = '!'; (int)i < '~' + 1; i++) {

			if (((int)i - 2) % 10 == 0) {
				System.out.println(i + " ");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
