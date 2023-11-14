/* Este programa exibe uma tabela de conversões de galões em litros */

public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;

        counter = 0; // inicialmente o contador de linhas é configurado com zero
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854; // converte para litros
            System.out.println(gallons + "gallons is " + liters + " liters.");

            counter++; // incrementa o contador de linhas
            // a cada décima linha, exibe uma linha em branco
            if (counter == 10) {// se o valor do contador for 10 exibe uma linha em branco
                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }

}
