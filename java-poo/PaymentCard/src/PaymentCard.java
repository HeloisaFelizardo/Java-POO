
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        this.balance = this.balance >= 2.60 ? this.balance - 2.60 : this.balance;
    }

    public void eatHeartily() {

        this.balance = this.balance >= 4.60 ? this.balance - 4.60 : this.balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance = Math.min(this.balance + amount, 150);
        }
    }
    /*    
    a condição amount > 0 garante que o valor só será adicionado se for positivo.
    A função Math.min é usada para garantir que o saldo não ultrapasse 150 euros. 
    Isso simplifica a lógica e garante que o saldo não seja afetado se o valor de 
    recarga for negativo.
    */
}