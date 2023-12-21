/*
 * Complete o método public static void printArrayInStars(int[] array) na classe chamada 'Impressora' para fazer com que ele imprima uma linha de estrelas para cada número da matriz. A quantidade de estrelas em cada linha é definida pelo número correspondente na matriz.

Você pode experimentar a impressão com este exemplo:

int[] array = {5, 1, 3, 4, 2};
printArrayInStars(array);
Exemplo de saída

*****
*
***
****
**
O 0º elemento do array é 5, então a primeira linha tem 5 estrelas. O próximo tem 1 etc.
*/
public class PrinterStars {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
         for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }
             System.out.println("");
        }
    }
}

