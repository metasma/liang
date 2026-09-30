class Main {
	public static void main(String[] args) {

		System.out.println(System.currentTimeMillis());
	
		for (int i = 0; i < 60; i++) {

			printCurrentTime();
			waitSecond();
		}
	}

	public static int getSeconds() {

		return (int)(System.currentTimeMillis() / 1000) % 60;
	}

	public static int getMinutes() {

		return (int)((System.currentTimeMillis() / 1000) / 60) % 60;
	}

	public static int getHours() {

		return (int)(((System.currentTimeMillis() / 1000) / 60) / 60 + 5) % 24;
	}

	public static void printCurrentTime() {

		System.out.println(getHours() + ":" + getMinutes() + ":" + getSeconds());
	}

	public static void waitSecond() {

		long positionStart = System.currentTimeMillis();
		long positionEnd = System.currentTimeMillis() + 1000;

		for (long runner = System.currentTimeMillis(); runner < positionEnd; runner = System.currentTimeMillis()) {
			//continue;
		}
	}
}
