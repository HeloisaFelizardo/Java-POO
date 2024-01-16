// Classe que representa um item com um nome e peso
public class Item {
    
    // Variáveis de instância privadas para armazenar o nome e peso do item
    private String name;
    private int weight;

    // Construtor para inicializar um objeto Item com um nome e peso fornecidos
    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    // Método para obter o nome do item
    public String getName() {
        return name;
    }

    // Método para obter o peso do item
    public int getWeight() {
        return weight;
    }

    // Override do método toString para fornecer uma representação em string personalizada do objeto Item
    @Override
    public String toString() {
        // Converte a primeira letra do nome para maiúscula e concatena com o restante do nome e o peso
        return name.substring(0, 1).toUpperCase() + name.substring(1) + " (" + weight + " kg)";
    }
}
