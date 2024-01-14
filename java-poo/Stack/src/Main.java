
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        
        System.out.println();

        Stack d = new Stack();
        System.out.println(d.isEmpty());
        System.out.println(d.values());
        d.add("Value");
        System.out.println(d.isEmpty());
        System.out.println(d.values());
        String taken = d.take();
        System.out.println(d.isEmpty());
        System.out.println(d.values());
        System.out.println(taken);
        
        System.out.println();

        Stack a = new Stack();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        while (!a.isEmpty()) {
            System.out.println(a.take());
        }

    }
}
