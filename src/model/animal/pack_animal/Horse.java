package model.animal.pack_animal;

import model.animal.pack_animal.PackAnimal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class Horse extends PackAnimal {
    private final String breed;

    public Horse(String id, String name, LocalDate birthDate, String breed) {
        super(id, name, birthDate, 0); // Use default stamina or adjust as needed
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Neigh! Neigh!");
    }

    @Override
    public void carryLoad() {
        System.out.println("The horse is carrying a load.");
    }

    @Override
    public String toString() {
        return String.format("%s\nBreed: %s", super.toString(), breed);
    }
}
