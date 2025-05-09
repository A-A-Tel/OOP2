package animals;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

public abstract class Animal {

    private String name;
    private int age;
    private double weight;
    private String breed;
    private boolean alive = true;
    public Animal() {}

    public Animal(String name, int age, double weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        isDead();
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        isDead();
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        isDead();
        this.weight = weight;
    }

    public boolean isAlive() {
        return alive;
    }
    public void kill() {
        isDead();
        alive = false;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        isDead();
        this.breed = breed;
    }

    public void eat(double foodWeight) {
        isDead();
        this.weight += foodWeight;
    }

    protected void isDead() {
        if (!alive) {
            throw new IllegalCallerException("Animal is dead,");
        }
    }






}
