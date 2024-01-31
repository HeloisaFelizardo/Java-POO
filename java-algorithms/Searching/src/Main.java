import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // O programa abaixo destina-se a testar os algoritmos de busca que você irá escrever
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        // Pede ao usuário para inserir o número de livros a serem criados
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        
        // Cria os livros com IDs sequenciais e nomes baseados no índice
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        // Ordena a lista de livros pelo ID antes de realizar as buscas
        Collections.sort(books, (book1, book2) -> Long.compare(book1.getId(), book2.getId()));

        // Solicita ao usuário o ID do livro a ser procurado
        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        // Busca linear
        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        // Busca binária
        System.out.println("");
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
        scanner.close();
    }

    // Método de busca linear
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        // Itera sobre a lista de livros
        for (int i = 0; i < books.size(); i++) {
            // Verifica se o ID do livro atual é igual ao ID procurado
            if (books.get(i).getId() == searchedId) {
                return i; // Retorna o índice se o livro for encontrado
            }
        }
        return -1; // Retorna -1 se o livro não for encontrado
    }

    // Método de busca binária
    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size() - 1;

        // Loop até que o intervalo seja válido
        while (begin <= end) {
            int middle = (end + begin) / 2;

            // Verifica se o ID do livro no meio é igual ao ID procurado
            if (books.get(middle).getId() == searchedId) {
                return middle; // Retorna o índice do livro se encontrado
            }

            // Atualiza o intervalo dependendo se o ID do livro no meio é menor ou maior que o ID procurado
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1; // Retorna -1 se o livro não for encontrado
    }
}


