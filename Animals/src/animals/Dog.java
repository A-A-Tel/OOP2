package animals;

public class Dog extends Animal {

    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight, breed);
    }

    public void bark() {
        isDead();
        System.out.println("Woof");
    }
}
