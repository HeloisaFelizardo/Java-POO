/*Crie a classe Debt que possui variáveis ​​de instância de tipo duplo de balance e interestRate. 
 * O saldo e a taxa de juros são passados ​​ao construtor como parâmetros
 *  public Debt(double initialBalance, double initialInterestRate).
 *  Além disso, crie os métodos public void printBalance() e public void waitOneYear() 
 *  para a classe. O método printBalance imprime o saldo atual e o método waitOneYear 
 *  aumenta o valor da dívida.
 *  A dívida aumenta multiplicando o saldo pela taxa de juros.
 *  
 *  Quando você conseguir fazer o programa funcionar, 
 *  verifique também o exemplo anterior com as taxas de juros da recessão do início do século XX.
 *  Depois de fazer o programa funcionar, experimente o exemplo anterior com as 
 *  taxas de juros da recessão do início da década de 1990, quando as taxas de juros 
 *  chegavam a 15-20% - tente trocar a taxa de juros do exemplo acima por 1.20 e veja o 
 *  que acontece.
*/

public class Debt {
    private double balance;
    private double interestRate;
    
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }
    
    public void printBalance() {
        System.out.println(String.format("%.1f", this.balance));
    }
    
    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
    }
}
