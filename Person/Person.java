package edu.faf.oop.Person;

import edu.faf.oop.RootClass.Root;

import java.util.Random;

public class Person extends Root {
    private String name;
    protected int age;

    protected Person(String name, String itemId) {
        super(itemId);
        this.name = name;
        this.age = returnRandomAge();
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int returnRandomAge() {
        Random random = new Random();
        return random.nextInt(60-11) + 11;
    }
    public int getAge() {
        return age;
    }
}
