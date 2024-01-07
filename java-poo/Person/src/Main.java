
public class Main {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 19, 6, 1963);
        Person antti = new Person("Antti", 17, 7, 1984);

        pekka.growOlder();
        pekka.growOlder();

        antti.growOlder();

        System.out.println("Pekka's age: " + pekka.returnAge());
        System.out.println("Antti's age: " + antti.returnAge());
        int combined = pekka.returnAge() + antti.returnAge();

        System.out.println("Pekka's and Antti's combined age " + combined + " years");
        

        int i = 0;
        while (i < 30) {
            pekka.growOlder();
            i = i + 1;
        }

        antti.growOlder();

        System.out.println("");

        if (antti.isOfLegalAge()) {
            System.out.println(antti.getName() + " is of legal age");
        } else {
            System.out.println(antti.getName() + " is underage");
        }

        if (pekka.isOfLegalAge()) {
            System.out.println(pekka.getName() + " is of legal age");
        } else {
            System.out.println(pekka.getName() + " is underage ");
        }
        
        System.out.println(antti); // same as System.out.println(antti.toString());
        System.out.println(pekka); // same as System.out.println(pekka.toString());
        
        Person matti = new Person("Matti");
        Person juhana = new Person("Juhana");

        matti.setHeight(180);
        matti.setWeight(86);

        juhana.setHeight(175);
        juhana.setWeight(64);

        System.out.println(matti.getName() + ", body mass index is " + matti.bodyMassIndex());
        System.out.println(juhana.getName() + ", body mass index is " + juhana.bodyMassIndex());
        
        Person matt = new Person("Matt");
        matt.setWeight(86);
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);

        if (waterTrack.allowedToRide(matt)) {
            System.out.println(matt.getName() + " may enter the ride");
        } else {
            System.out.println(matt.getName() + " may not enter the ride");
        }

        if (waterTrack.allowedToRide(jasper)) {
            System.out.println(jasper.getName() + " may enter the ride");
        } else {
            System.out.println(jasper.getName() + " may not enter the ride");
        }

        System.out.println(waterTrack);
        
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);      
      
        System.out.println(muhammad);
        System.out.println(pascal);
        
        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        SimpleDate d3 = new SimpleDate(1, 3, 2011);
        SimpleDate d4 = new SimpleDate(31, 12, 2010);

        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

        System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
        System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

        System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
        System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));
    }   
}
