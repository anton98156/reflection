package com;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3, "Golden Retriever"),
                new Cat("Whiskers", 5, "Ball of Yarn")
        };

        for (Animal animal : animals) {
            Class<?> animalClass = animal.getClass();
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

            try {
                Method makeSoundMethod = animalClass.getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
            }

            System.out.println();
        }
    }
}

