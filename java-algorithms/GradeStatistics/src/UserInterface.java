import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner; // Scanner para entrada do usuário
    private final GradeRegister register; // Instância de GradeRegister para lidar com os registros

    // Construtor da classe UserInterface
    public UserInterface(Scanner scanner, GradeRegister register) {
        this.register = register;
        this.scanner = scanner;
    }

    // Método para iniciar a interface do usuário
    public void start() {

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            final int input = Integer.valueOf(scanner.nextLine()); // Lê a entrada do usuário como um número inteiro

            if (input == -1) {
                break; // Se o usuário inserir -1, encerra o loop
            }

            if (input < 0 || input > 100) {
                continue; // Ignora entradas inválidas fora do intervalo [0, 100]
            }

            register.addPoints(input); // Adiciona os pontos à instância de GradeRegister
        }

        register.gradeDistribution(); // Calcula a distribuição de notas

        // Imprime as estatísticas dos pontos e notas
        System.out.println(register.printAveragePoints());
        System.out.println(register.printAveragePassPoints());
        System.out.println(register.printPassPercentage());
        System.out.println(register.printGradeDistribution());
    }

}
