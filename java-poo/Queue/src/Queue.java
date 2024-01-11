
public class Queue {
	char q[]; // esse array contém a fila
	int putloc, getloc; // os índices put get
	
	Queue (int size){
		q = new char[size]; //aloca memória para a fila
		putloc = getloc = 0;
	}
	
	//insere um caractere na fila
	void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	//obtém um caractere na fila
	char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		return q[getloc++];
	}
}
