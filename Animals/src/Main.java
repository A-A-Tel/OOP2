import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Parrot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Knox", 3, 40.12, "Doberman");
        Cat cat = new Cat("Nae", 3, 3, "Coon");
        Cat cat1 = new Cat("Minu", 2, 6, "Brad");
        Parrot parrot = new Parrot("Jimbo", 4, 0.7, "Cockatoo");

        dog.bark();
        cat.meow();

        List<Animal> animals = List.of(
                dog,
                cat,
                parrot
        );

        Cat cat2 = (Cat) cat.procreate(cat1);

        for (Animal animal : animals) {
            animal.kill();
        }
    }
}
