import java.util.ArrayList;

public class GradeRegister {

    private final ArrayList<Integer> points; // Lista para armazenar os pontos
    private final int[] gradeCounts; // Array para contar o número de ocorrências de cada nota    

    // Construtor da classe GradeRegister
    public GradeRegister() {
        this.points = new ArrayList<>(); // Inicializa a lista de pontos
        this.gradeCounts = new int[6]; // Inicializa o array de contagem de notas (de 0 a 5)
    }

    // Método para adicionar pontos à lista
    public void addPoints(int points) {
        this.points.add(points);
    }

    // Método para calcular a média de todos os pontos
    public double averagePoints() {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return (double) sum / this.points.size();
    }

    // Método para calcular a média dos pontos que resultam em aprovação (>= 50)
    public double averagePassGrade() {
        int sumPassing = 0;
        int passingCount = 0;
        for (int point : points) {
            if (point >= 50) {
                sumPassing += point;
                passingCount++;
            }
        }
        return passingCount == 0 ? 0.0 : (double) sumPassing / passingCount;
    }

    // Método para calcular a porcentagem de aprovação
    public double passPercentage() {
        int passingCount = 0;
        for (int point : points) {
            if (point >= 50) {
                passingCount++;
            }
        }
        return 100.0 * passingCount / this.points.size();
    }

    // Método para imprimir a média de todos os pontos
    public String printAveragePoints() {
        return "Point average (all): " + averagePoints();
    }

    // Método para imprimir a média dos pontos de aprovação
    public String printAveragePassPoints() {
        double averagePassing = averagePassGrade();
        return "Point average (passing): " + (averagePassing == 0.0 ? "-" : averagePassing);
    }

    // Método para imprimir a porcentagem de aprovação
    public String printPassPercentage() {
        return "Pass percentage: " + passPercentage();
    }

    // Método para contar o número de ocorrências de cada nota e imprimir a distribuição de notas
    public int gradeDistribution() {
        for (int point : points) {
            if (point < 50) {
                gradeCounts[0]++; // Incrementa o contador da nota 0
            } else if (point < 60) {
                gradeCounts[1]++; // Incrementa o contador da nota 1
            } else if (point < 70) {
                gradeCounts[2]++; // Incrementa o contador da nota 2
            } else if (point < 80) {
                gradeCounts[3]++; // Incrementa o contador da nota 3
            } else if (point < 90) {
                gradeCounts[4]++; // Incrementa o contador da nota 4
            } else {
                gradeCounts[5]++; // Incrementa o contador da nota 5
            }
        }
        // Aqui, você precisará determinar qual nota tem mais ocorrências e retornar essa nota
        return 5; // Apenas retornando a nota 5 como exemplo
    }

    // Método para imprimir a distribuição de notas
    public String printGradeDistribution() {
        String distribution = "";
        for (int i = 5; i >= 0; i--) {
            distribution += i + ": ";
            for (int j = 0; j < gradeCounts[i]; j++) {
                distribution += "*"; // Adiciona uma estrela para cada ocorrência da nota
            }
            distribution += "\n"; // Adiciona uma quebra de linha para separar as notas
        }
        return distribution; // Retorna a distribuição de notas como uma string
    }

}
