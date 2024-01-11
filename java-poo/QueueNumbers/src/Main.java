
public class Main {

	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		int number;
		int i;

		System.out.println("Using bigQ to store the alphabet.");
		// insere alguns numeros em bigQ
		for (i = 0; i < 26; i++)
			bigQ.put(1 + i);

		// recupera e exibe elementos de bigQ
		System.out.print("Contents of bigQ: ");

		for (i = 0; i < 26; i++) {
			number = bigQ.get();
			if (number != 0)
				System.out.print(number + " ");
		}
		System.out.println("\n");

		System.out.println("Using smallQ to generate errors.");
		// Agora, usa smallQ para gerar alguns erros
		for (i = 0; i < 5; i++) {
			System.out.print("Attempting to store " + (5 - i));

			smallQ.put(5 - i);

			System.out.println();
		}
		System.out.println();

		// mais erros em smallQ
		System.out.println("Contents of smallQ: ");
		for (i = 0; i < 5; i++) {
			number = smallQ.get();

			if (number != 0)
				System.out.print(number + " ");
		}
	}
}
