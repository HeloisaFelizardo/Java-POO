import java.util.Scanner;

// Definição da classe UserInterface
public class UserInterface {

    // Atributos privados
    private GradeRegister register;  // Objeto GradeRegister para armazenar as notas
    private Scanner scanner;        // Objeto Scanner para a entrada do usuário

    // Construtor que recebe um objeto GradeRegister e um objeto Scanner como parâmetros
    public UserInterface(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }

    // Método para iniciar a interface do usuário
    public void start() {
        readPoints();              // Método para ler os pontos do usuário
        System.out.println("");    // Imprime uma linha em branco
        printGradeDistribution();   // Método para imprimir a distribuição de notas
        printAveragePoints();
        printAverageGrades();
    }

    // Método para ler os pontos do usuário
    public void readPoints() {
        // Loop para continuar pedindo pontos até que o usuário pressione Enter
        while (true) {
            System.out.print("Points: ");  // Solicitação de entrada de pontos
            String input = scanner.nextLine();

            // Verifica se a entrada está vazia (usuário pressionou Enter sem digitar nada)
            if (input.equals("")) {
                break;  // Encerra o loop se a entrada estiver vazia
            }

            // Converte a entrada para um valor inteiro (pontuação)
            int points = Integer.valueOf(input);

            // Verifica se a pontuação está dentro do intervalo válido (0 a 100)
            if (points < 0 || points > 100) {
                System.out.println("Impossible number.");  // Exibe uma mensagem de erro
                continue;  // Continua para a próxima iteração do loop
            }

            // Adiciona a nota com base nos pontos à lista do registro
            this.register.addGradeBasedOnPoints(points);
        }
    }

    // Método para imprimir a distribuição de notas com um gráfico de barras
    public void printGradeDistribution() {
        int grade = 5;
        while (grade >= 0) {
            int stars = register.numberOfGrades(grade);
            System.out.print(grade + ": ");
            printStars(stars);  // Método para imprimir estrelas com base no número de ocorrências
            System.out.println("");  // Imprime uma linha em branco

            grade = grade - 1;  // Decrementa a nota para a próxima iteração do loop
        }
    }

    // Método estático para imprimir estrelas com base no número fornecido
    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");  // Imprime uma estrela
            stars--;  // Decrementa o número de estrelas restantes
        }
    }
    
    // Imprime a media dos pontos
    public void printAveragePoints(){
        System.out.println("The average of points: " + register.averageOfPoints());
    }
    
    
    // Imprime a media das notas
    public void printAverageGrades(){
        System.out.println("The average of grades: " + register.averageOfGrades());
    }
}
