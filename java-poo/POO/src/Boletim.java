

class NotasBoletim {
	
	private float media, n1, n2;
	
	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public void calcularMedia() {
		media = (n1 + n2) /2;
		if(media >= 8 && media <= 10) 
			System.out.println("Conceito A");
		else if(media >= 6 && media < 8) 
			System.out.println("Conceito B");
		else if(media >= 4 && media < 6) 
			System.out.println("Conceito C");
		else
			System.out.println("Conceito D");
	}

}

public class Boletim {
    public static void main(String[] args) {
        // Criar um objeto Boletim
    	NotasBoletim boletim = new NotasBoletim();

        // Definir valores para as notas
        boletim.setN1(7.5f);
        boletim.setN2(8.3f);

        // Calcular a média e exibir o conceito
        boletim.calcularMedia();
    }
}

