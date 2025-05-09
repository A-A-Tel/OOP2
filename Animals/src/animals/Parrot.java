package animals;

public class Parrot extends Animal {

    public Parrot(String name, int age, double weight, String breed) {
        super(name, age, weight, breed);
    }

    public void mimic(String sound) {
        System.out.println(sound);
    }
}
