import java.util.ArrayList;

public class Package {

    // ArrayList para armazenar os presentes no pacote.
    private ArrayList<Gift> gifts;

    // Construtor que inicializa a lista de presentes.
    public Package() {
        this.gifts = new ArrayList<>();
    }

    // Método para adicionar um presente à lista.
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    // Método para calcular o peso total dos presentes no pacote.
    public int totalWeight() {
        // Verifica se a lista de presentes está vazia.
        if (gifts.isEmpty()) {
            // Se estiver vazia, retorna -1 indicando que não há presentes.
            return -1;
        }

        // Inicializa a variável para armazenar a soma dos pesos dos presentes.
        int sumOfWeights = 0;

        // Itera sobre cada presente na lista.
        for (Gift gift : gifts) {
            // Adiciona o peso do presente à soma total.
            sumOfWeights += gift.getWeight();
        }

        // Retorna a soma total dos pesos dos presentes.
        return sumOfWeights;
    }
}
