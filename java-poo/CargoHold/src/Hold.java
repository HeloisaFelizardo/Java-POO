/*Estes comentários explicam a função de cada método na classe Hold. 
 * A classe representa um porão que pode conter várias malas, 
 * e os métodos são usados para adicionar malas ao porão, 
 * calcular o peso total das malas, 
 * gerar uma representação em string do porão 
 * e imprimir os itens de todas as malas no porão. 
 */

import java.util.ArrayList;

// Classe que representa um porão que contém malas
public class Hold {

    // Peso máximo permitido para o porão
    private int maximumWeight;

    // Lista de malas no porão
    private ArrayList<Suitcase> suitcases;

    // Construtor que inicializa o porão com um peso máximo
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    // Método para adicionar uma mala ao porão se não exceder o peso máximo
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    // Método para calcular o peso total de todas as malas no porão
    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    // Override do método toString para gerar uma representação em string do porão
    @Override
    public String toString() {
        return suitcases.size() + " suitcase" + (suitcases.size() != 1 ? "s" : "") + " (" + totalWeight() + " kg)";
    }

    // Método para imprimir os itens de todas as malas no porão
    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}
