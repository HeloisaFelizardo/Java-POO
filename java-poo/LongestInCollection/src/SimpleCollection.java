import java.util.ArrayList;

public class SimpleCollection {

    // Nome da coleção.
    private String name;

    // Lista para armazenar os elementos da coleção.
    private ArrayList<String> elements;

    // Construtor que inicializa a coleção com um nome e uma lista vazia de elementos.
    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    // Método para adicionar um elemento à coleção.
    public void add(String element) {
        this.elements.add(element);
    }

    // Método para obter a lista de elementos da coleção.
    public ArrayList<String> getElements() {
        return this.elements;
    }

    // Método para encontrar o elemento mais longo na coleção.
    public String longest() {
        // Verifica se a coleção está vazia.
        if (elements.isEmpty()) {
            // Se estiver vazia, retorna null indicando que não há elementos.
            return null;
        }

        // Inicializa a variável para armazenar o elemento mais longo.
        String returnLongest = this.elements.get(0);

        // Itera sobre cada elemento na coleção.
        for (String element : elements) {
            // Compara o comprimento do elemento atual com o comprimento do elemento mais longo.
            if (returnLongest.length() < element.length()) {
                // Se o elemento atual for mais longo, atualiza o elemento mais longo.
                returnLongest = element;
            }
        }

        // Retorna o elemento mais longo encontrado na coleção.
        return returnLongest;
    }
}
