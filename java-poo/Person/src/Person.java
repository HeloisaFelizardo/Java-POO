public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName) {
        this.name = initialName;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
    }
    
    public void setHeight(int newHeight) {
    	this.height = newHeight;
    }
    
    public void setWeight(int newWeight) {
    	this.weight = newWeight;
    }
    
    public double bodyMassIndex() {
    	double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public String toString() {
        return this.name + ", age " + this.age + " years";
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
}
