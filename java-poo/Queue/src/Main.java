// Demonstra a classe Queue
public class Main {

	public static void main(String[] args) {
		Queue bigQ = new Queue(100);
		Queue smallQ = new Queue(4);
		//Contrói uma fila vazia para 10 elementos
		Queue q1 = new Queue(10);
		
		char name[] = {'T', 'o', 'm'};
		
		// Constrói uma fila a partir do array		
		Queue q2 = new Queue (name);
		
		char ch;
		int i;
		
		// insere alguns caracteres em q1
		for(i = 0; i < 10; i++)
			q1.put((char) ('A' + i));
		
		// Contrói uma fila a partir de outra
		Queue q3 = new Queue(q1);
		
		// Exibe as filas 
		System.out.print("Contents of q1: ");
		for (i = 0; i < 10; i++) {
			ch = q1.get();
			System.out.print(ch);
		}			
		
		System.out.println("\n");
		
		System.out.print("Contents of q2: ");
		for (i = 0; i < name.length; i++) {
			ch = q2.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		System.out.print("Contents of q3: ");
		for(i = 0; i < 10; i++) {
			ch = q3.get();
			System.out.print(ch);
		}
		
		System.out.println("\n");

		System.out.println("Using bigQ to store the alphabet.");
		// insere alguns numeros em bigQ
		for (i = 0; i < 26; i++)
			bigQ.put((char) ('A' + i));

		// recupera e exibe elementos de bigQ
		System.out.print("Contents of bigQ: ");

		for (i = 0; i < 26; i++) {
			ch = bigQ.get();
			if (ch != (char) 0)
				System.out.print(ch);
		}
		System.out.println("\n");

		System.out.println("Using smallQ to generate errors.");
		// Agora, usa smallQ para gerar alguns erros
		for (i = 0; i < 5; i++) {
			System.out.print("Attempting to store " + (char) ('Z' - i));

			smallQ.put((char) ('Z' - i));

			System.out.println();
		}
		System.out.println();

		// mais erros em smallQ
		System.out.println("Contents of smallQ: ");
		for (i = 0; i < 5; i++) {
			ch = smallQ.get();

			if (ch != (char) 0)
				System.out.print(ch);
		}
	}
}
