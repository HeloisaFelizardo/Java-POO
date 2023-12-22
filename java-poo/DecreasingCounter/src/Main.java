

public class Main {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);

        counter.printValue();
        
        counter.reset();
        counter.printValue();
        
        counter.decrement();
        counter.printValue();        
     
    }
}
