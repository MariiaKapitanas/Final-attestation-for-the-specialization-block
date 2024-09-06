package model.animal.pet.dog;

import model.animal.pet.Pet;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class Dog extends Pet {
    private final String breed;

    public Dog(String id, String name, LocalDate birthDate, String breed) {
        super(id, name, birthDate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public String toString() {
        return String.format("%s\nBreed: %s", super.toString(), breed);
    }
}
