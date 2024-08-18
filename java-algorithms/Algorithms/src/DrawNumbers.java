import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DrawNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int inicio;
        int fim;

        System.out.println("Digite a quantidade de números a ser sorteada por rodada: ");
        quantidade = sc.nextInt();

        while (quantidade <= 0) {
            System.out.println("A quantidade de números deve ser maior que 0. Tente novamente:");
            quantidade = sc.nextInt();
        }

        System.out.println("Digite a faixa de números a ser sorteada (Ex: 10 60): ");
        inicio = sc.nextInt();
        fim = sc.nextInt();

        while (fim < inicio) {
            System.out.println("O último número deve ser maior ou igual ao primeiro. Tente novamente:");
            inicio = sc.nextInt();
            fim = sc.nextInt();
        }

        // Verificar se a quantidade de números possíveis é suficiente
        if (quantidade > (fim - inicio + 1)) {
            System.out.println("Não é possível sortear essa quantidade de números sem repetição na faixa fornecida.");
            return;
        }

        // Conjunto com todos os números disponíveis para sorteio
        Set<Integer> todosNumeros = new LinkedHashSet<>();
        for (int i = inicio; i <= fim; i++) {
            todosNumeros.add(i);
        }

        // Continuar sorteando até que todos os números sejam sorteados
        while (!todosNumeros.isEmpty()) {
            Set<Integer> sorteadosNaRodada = new HashSet<>();

            while (sorteadosNaRodada.size() < quantidade && !todosNumeros.isEmpty()) {
                // Sorteia um número e remove do conjunto de disponíveis
                int numeroSorteado = (int) (Math.random() * todosNumeros.size());
                Integer sorteado = (Integer) todosNumeros.toArray()[numeroSorteado];
                sorteadosNaRodada.add(sorteado);
                todosNumeros.remove(sorteado);
            }

            // Exibe os números sorteados na rodada
            System.out.println("Números sorteados nesta rodada: " + sorteadosNaRodada);

            // Exibe os números restantes
            System.out.println("Números restantes: " + todosNumeros);

            // Solicita a continuação do sorteio
            System.out.println("Deseja fazer outra rodada? (s/n)");
            String resposta = sc.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Sorteio finalizado.");
    }
}
