import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário
        GradeRegister register = new GradeRegister(); // Cria um objeto GradeRegister para registrar os pontos

        // Cria um objeto UserInterface para interagir com o usuário, passando o Scanner e o GradeRegister
        UserInterface userInterface = new UserInterface(scanner, register);
        
        // Inicia a interface do usuário
        userInterface.start();    
    }
}
