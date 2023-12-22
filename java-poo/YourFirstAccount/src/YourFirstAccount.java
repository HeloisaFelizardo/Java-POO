
public class YourFirstAccount {

    public static void main(String[] args) {
        Account luciosAccount = new Account("Lucios' s account", 100.00);
        
        luciosAccount.deposit(20);
        System.out.println(luciosAccount.saldo());
    }
}
