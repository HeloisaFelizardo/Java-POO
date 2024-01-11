
public class Main {

    public static void main(String[] args) {
        //Part 1
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
//  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 25.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);  // 15.00e

        // Part 2
        a = new Money(10, 0);
        b = new Money(3, 0);
        c = new Money(5, 0);

        System.out.println(a.lessThan(b));  // false
        System.out.println(b.lessThan(c));  // true

        // Part 3
        a = new Money(10, 0);
        b = new Money(3, 50);

        c = a.minus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 6.50e

        c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
//  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 3.50e
        System.out.println(c);  // 0.00e
    }
}
