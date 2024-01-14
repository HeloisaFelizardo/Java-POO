
public class Main {

    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);
        
        System.out.println("");
        
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println(j);

        System.out.println();

        j.add("magneto");
        System.out.println(j);

        System.out.println();

        j.add("mystique");
        System.out.println(j);

        System.out.println();

        j.add("phoenix");
        System.out.println(j);

    }
}
