// Uma classe de fila para caracteres
public class Queue {
	private char q[]; // esse array contém a fila
	private int putloc, getloc; // os índices put get

	// Contrói uma fila vazia dados seu tamanho
	Queue(int size) {
		q = new char[size]; // aloca memória para a fila
		putloc = getloc = 0;
	}

	// Constrói uma fila a partir de outra
	Queue(Queue ob) {
		putloc = ob.putloc;
		getloc = ob.getloc;
		q = new char[ob.q.length];

		// Copia elementos
		for (int i = getloc; i < putloc; i++)
			q[i] = ob.q[i];
	}

	// Constrói uma fila com valores iniciais
	Queue(char a[]) {
		putloc = 0;
		getloc = 0;
		q = new char[a.length];

		for (int i = 0; i < a.length; i++)
			put(a[i]);
	}

	// insere um caractere na fila
	void put(char ch) {
		if (putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}

	// obtém um caractere na fila
	char get() {
		if (getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
}
