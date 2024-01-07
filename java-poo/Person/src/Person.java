public class Person {

    private String name;
    private int age;
    private SimpleDate birthday;
    private int weight;
    private int height;

    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public boolean olderThan(Person compared) {
        return this.birthday.before(compared.getBirthday());
    }

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heightPerHundred = this.height / 100.0;
        return this.weight / (heightPerHundred * heightPerHundred);
    }

    public String toString() {
        return this.name + ", age " + this.age + " years. Born on " + this.birthday.toString();
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }
    
    public int returnAge(){
        return this.age;
    }

    public boolean isOfLegalAge() {
        return this.age >= 18;
    }

    public String getName() {
        return this.name;
    }

    public SimpleDate getBirthday() {
        return this.birthday;
    }
}
