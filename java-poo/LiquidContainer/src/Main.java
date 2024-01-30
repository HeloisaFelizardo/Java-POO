import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0; // Inicializa o primeiro recipiente com 0 litros
        int secondContainer = 0; // Inicializa o segundo recipiente com 0 litros

        // Loop principal que executa o programa até que o usuário escolha sair
        while (true) {
            // Mostra a quantidade de líquido em cada recipiente
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            // Recebe o comando do usuário
            String input = scan.nextLine();
            
            // Verifica se o usuário deseja sair do programa
            if (input.equals("quit")) {
                break; // Sai do loop e encerra o programa
            }

            // Divide a entrada do usuário em partes (comando e quantidade)
            String[] parts = input.split(" ");
            String command = parts[0]; // O comando é a primeira parte da entrada
            int amount = Integer.valueOf(parts[1]); // A quantidade é a segunda parte da entrada

            // Executa o comando fornecido pelo usuário
            switch (command) {
                case "add":
                    // Adiciona líquido ao primeiro recipiente
                    if (amount > 0) {
                        firstContainer += amount;
                        // Garante que a capacidade máxima do recipiente seja 100 litros
                        if (firstContainer > 100) {
                            firstContainer = 100;
                        }
                    }
                    break;
                case "move":
                    // Move líquido do primeiro para o segundo recipiente
                    if (amount > 0) {
                        if (firstContainer >= amount) {
                            firstContainer -= amount;
                            secondContainer += amount;
                            // Garante que a capacidade máxima do segundo recipiente seja 100 litros
                            if (secondContainer > 100) {
                                secondContainer = 100;
                            }
                        } else {
                            // Move todo o líquido restante do primeiro recipiente
                            secondContainer += firstContainer;
                            firstContainer = 0;
                            if (secondContainer > 100) {
                                secondContainer = 100;
                            }
                        }
                    }
                    break;
                case "remove":
                    // Remove líquido do segundo recipiente
                    if (amount > 0) {
                        secondContainer -= amount;
                        // Garante que a quantidade de líquido no segundo recipiente não seja negativa
                        if (secondContainer < 0) {
                            secondContainer = 0;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        scan.close();
    }
}
