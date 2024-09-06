package model.animal.pet.cat;

import model.animal.pet.Pet;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class Cat extends Pet {
    private final String breed;

    public Cat(String id, String name, LocalDate birthDate, String breed) {
        super(id, name, birthDate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public String toString() {
        return String.format("%s\nBreed: %s", super.toString(), breed);
    }
}
