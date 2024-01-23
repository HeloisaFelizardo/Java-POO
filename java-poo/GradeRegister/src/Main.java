import java.util.Scanner;

// Definição da classe Program
public class Main {

    // Método principal
    public static void main(String[] args) {
        // Criação de um objeto Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criação de um objeto GradeRegister para armazenar as notas
        GradeRegister register = new GradeRegister();

        // Criação de um objeto UserInterface, passando o objeto GradeRegister e o objeto Scanner como parâmetros
        UserInterface userInterface = new UserInterface(register, scanner);

        // Chama o método start() da classe UserInterface para iniciar a interação do usuário
        userInterface.start();

        // Não é necessário fechar o Scanner neste contexto, pois o encerramento do programa fará isso automaticamente
    }
}
