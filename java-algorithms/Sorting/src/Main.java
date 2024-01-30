import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Part 1
        int[] numbers1 = {6, 5, 8, 7, 11};        

        int smallestNumber = smallest(numbers1);
        System.out.println("Smallest: " + smallestNumber);
        
        //Part 2
        int[] numbers2 = {6, 5, 8, 7, 11};

        int indexSmallest = indexOfSmallest(numbers2);
        System.out.println("Index of the smallest number: " + indexSmallest);
        
        //Part 3
        int[] numbers3 = {-1, 6, 9, 8, 12};

        System.out.println(Main.indexOfSmallestFrom(numbers3, 0));
        System.out.println(Main.indexOfSmallestFrom(numbers3, 1));
        System.out.println(Main.indexOfSmallestFrom(numbers3, 2));
        
        //Part 4
        int[] numbers4 = {3, 2, 5, 4, 8};
        
        System.out.println(Arrays.toString(numbers4));

        Main.swap(numbers4, 1, 0);
        System.out.println(Arrays.toString(numbers4));

        Main.swap(numbers4, 0, 3);
        System.out.println(Arrays.toString(numbers4));  
        
        //Part 5
        int[] numbers5 = {8, 3, 7, 9, 1, 2, 4};
      
        Main.sort(numbers5);
        
    }   

    public static int smallest(int[] numbers) {
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] numbers) {
        int indexOfSmallest = 0;
        int smallest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Atualiza o menor número encontrado
                indexOfSmallest = i; // Atualiza o índice do menor número
            }
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int swap = array[index1];
        array[index1] = array[index2];
        array[index2] = swap;
    }
    
     public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallest);
            System.out.println(Arrays.toString(array));
        }
    }

}
