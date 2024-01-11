
public class Queue {
	int q[]; // esse array contém a fila
	int putloc, getloc; // os índices put get
	
	Queue (int size){
		q = new int[size]; //aloca memória para a fila
		putloc = getloc = 0;
	}
	
	//insere um caractere na fila
	void put(int number) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = number;
	}
	
	//obtém um caractere na fila
	int get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty.");
			return (int) 0;
		}
		return q[getloc++];
	}
}
