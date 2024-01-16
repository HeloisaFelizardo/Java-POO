import java.util.ArrayList;

// Classe que representa uma mala
public class Suitcase {

    // Peso máximo permitido para a mala
    private int maximumWeight;

    // Lista de itens na mala
    private ArrayList<Item> items;

    // Construtor que inicializa a mala com um peso máximo
    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    // Método para adicionar um item à mala se não exceder o peso máximo
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            items.add(item);
        }
    }

    // Método para calcular o peso total dos itens na mala
    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    // Override do método toString para gerar uma representação em string da mala
    public String toString() {
        if (items.isEmpty()) {
            return "no items" + " (" + totalWeight() + " kg)";
        } else {
            return items.size() + " item" + (items.size() != 1 ? "s" : "") + " (" + totalWeight() + " kg)";
        }
    }

    // Método para imprimir os itens na mala
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    // Método para encontrar e retornar o item mais pesado na mala
    public Item heaviestItem() {
        // Verifica se a mala está vazia
        if (items.isEmpty()) return null;

        // Inicializa o item mais pesado com o primeiro item da lista
        Item returnHeaviestItem = items.get(0);

        // Itera sobre cada item na lista
        for (Item item : items) {
            // Compara o peso do item atual com o peso do item mais pesado
            if (returnHeaviestItem.getWeight() < item.getWeight()) {
                // Se o item atual for mais pesado, atualiza o item mais pesado
                returnHeaviestItem = item;
            }
        }

        // Retorna o item mais pesado encontrado na mala
        return returnHeaviestItem;
    }
}
