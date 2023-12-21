/*Portanto, além de chamar new, também podemos inicializar um array com um bloco, 
 * que contém valores separados por vírgula a serem atribuídos no array. Isso 
 * funciona para todos os tipos: abaixo inicializamos um array de strings e depois um 
 * array de números de ponto flutuante. Finalmente os valores são impressos.
*/
public class Array {

    public static void main(String[] args) {
        String[] arrayOfStrings = {"Matti L.", "Matti P.", "Matti V."};
        double[] arrayOfFloatingpoints = {1.20, 3.14, 100.0};
       
        for (int i = 0; i < arrayOfFloatingpoints.length; i++) {
            System.out.println(arrayOfStrings[i] + " " +  arrayOfFloatingpoints[i]);
        }
    }
}

