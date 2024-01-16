// Não modifique esta classe
import java.util.Objects;

// Classe que representa uma pessoa
public class Person {

    // Variáveis de instância privadas para representar o nome e a altura de uma pessoa.
    private String name;
    private int height;

    // Construtor para inicializar um objeto Person com um nome e altura fornecidos.
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    // Método getter para obter o nome da pessoa.
    public String getName() {
        return name;
    }

    // Método getter para obter a altura da pessoa.
    public int getHeight() {
        return height;
    }

    // Override do método toString para fornecer uma representação de string personalizada de um objeto Person.
    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }

    // Override do método equals para comparar dois objetos Person quanto à igualdade.
    @Override
    public boolean equals(Object obj) {
        // Verifica se as referências apontam para o mesmo objeto.
        if (this == obj) {
            return true;
        }
        // Verifica se o objeto sendo comparado é nulo.
        if (obj == null) {
            return false;
        }
        // Verifica se as classes dos objetos são iguais.
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Converte o objeto para Person para comparação detalhada dos atributos.
        final Person other = (Person) obj;
        // Compara o atributo de altura.
        if (this.height != other.height) {
            return false;
        }
        // Compara o atributo de nome usando Objects.equals para garantir segurança contra nulos.
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        // Se todas as condições forem atendidas, os objetos são considerados iguais.
        return true;
    }
}
