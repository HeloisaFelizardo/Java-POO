/* Demonstra um bloco de código */

public class BlocoDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // o alvo dessa instrução if é um bloco de código
        if (i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}
