public class Main {

	public static void main(String[] args) {
		Clock clock = new Clock();

		while (true) {
			System.out.println(clock);
			clock.advance();

			try {
				Thread.sleep(10);
			} catch (Exception e) {

			}
		}
	}
}
