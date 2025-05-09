package animals;

public class Cat extends Animal {

    public Cat(String name, int age, double weight, String breed) {
        super(name, age, weight, breed);
    }

    public void meow() {
        isDead();
        System.out.println("Meow");
    }
}
