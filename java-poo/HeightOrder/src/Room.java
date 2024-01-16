import java.util.ArrayList;

// Classe que representa uma sala contendo pessoas
public class Room {

    // Lista de pessoas na sala
    private ArrayList<Person> listOfPersons;

    // Construtor que inicializa a lista de pessoas
    public Room() {
        this.listOfPersons = new ArrayList<>();
    }

    // Método para adicionar uma pessoa à sala
    public void add(Person person) {
        listOfPersons.add(person);
    }

    // Método para verificar se a sala está vazia
    public boolean isEmpty() {
        return listOfPersons.isEmpty();
    }

    // Método para obter uma cópia da lista de pessoas na sala
    public ArrayList<Person> getPersons() {
        // Retorna uma nova ArrayList contendo os mesmos elementos da lista original
        return new ArrayList<>(listOfPersons);
    }

    // Método para encontrar a pessoa mais baixa na sala
    public Person shortest() {
        // Verifica se a lista de pessoas está vazia
        if (listOfPersons.isEmpty()) {
            return null;
        }

        // Inicializa a pessoa mais baixa com a primeira pessoa da lista
        Person returnPerson = listOfPersons.get(0);

        // Itera sobre cada pessoa na lista
        for (Person person : listOfPersons) {
            // Compara a altura da pessoa atual com a altura da pessoa mais baixa
            if (returnPerson.getHeight() > person.getHeight()) {
                // Se a pessoa atual for mais baixa, atualiza a pessoa mais baixa
                returnPerson = person;
            }
        }

        // Retorna a pessoa mais baixa encontrada na sala
        return returnPerson;
    }

    // Método para remover e retornar a pessoa mais baixa da sala
    public Person take() {
        // Verifica se a sala está vazia
        if (listOfPersons.isEmpty()) {
            return null;
        }
        
        // Obtém a pessoa mais baixa
        Person shortestPerson = shortest();
        
        // Remove a pessoa mais baixa da lista
        listOfPersons.remove(shortestPerson);
        
        // Retorna a pessoa mais baixa
        return shortestPerson;
    }
}
