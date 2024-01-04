public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(1);
        counter.increase();
        counter.increase();
        counter.increase();
        counter.increase(2);
        counter.decrease(3);
        System.out.println(counter.value());
    }
}
