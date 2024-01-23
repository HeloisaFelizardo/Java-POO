// Lógica do programa
// Importa a classe ArrayList do pacote java.util
import java.util.ArrayList;

// Definição da classe GradeRegister
public class GradeRegister {

    // Declaração de uma lista (ArrayList) para armazenar as notas
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    // Construtor da classe GradeRegister, inicializa a lista de notas
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    // Método para adicionar uma nota com base em pontos
    public void addGradeBasedOnPoints(int points) {
        // Chama o método pointsToGrades para converter os pontos em uma nota e adiciona à lista
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    // Método para obter o número de ocorrências de uma determinada nota na lista
    public int numberOfGrades(int grade) {
        // Inicializa um contador
        int count = 0;

        // Percorre a lista de notas
        for (int received : this.grades) {
            // Se a nota atual for igual à nota desejada, incrementa o contador
            if (received == grade) {
                count++;
            }
        }

        // Retorna o número de ocorrências da nota desejada na lista
        return count;
    }

    // Método estático para converter pontos em uma nota
    public static int pointsToGrades(int points) {
        // Inicializa a variável de nota com 0
        int grade = 0;

        // Utiliza estruturas condicionais para determinar a nota com base nos pontos
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        // Retorna a nota calculada
        return grade;
    }
    
    // Calcula a média das notas
    public double averageOfGrades(){
        int sum = 0;
        int count = grades.size();

        if (count == 0) {
            return -1; // Se o cadastro não contiver notas, retorna -1
        }

        for (int grade : grades) {
            sum += grade;
        }

        // Calcula a média como a soma das notas dividida pelo número de notas
        return (double) sum / count;        
    }
    
    //Calcula a média dos pontos
    public double averageOfPoints(){
        int sum = 0;
        int count = points.size();
        
        if(count == 0){
            return -1;
        }
        
        for(int point: points){
            sum += point;
        }
        
        // Calcula a média como a soma dos pontos dividida pelo número de pontos
        return (double) sum / count;
    }
}
