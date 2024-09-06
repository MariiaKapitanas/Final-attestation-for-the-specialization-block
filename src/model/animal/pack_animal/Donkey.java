package model.animal.pack_animal;

import model.animal.pack_animal.PackAnimal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class Donkey extends PackAnimal {
    public Donkey(String id, String name, LocalDate birthDate, int stamina) {
        super(id, name, birthDate, stamina);
    }

    @Override
    public void makeSound() {
        System.out.println("Hee-haw! Hee-haw!");
    }

    @Override
    public void carryLoad() {
        System.out.println("The donkey is carrying goods.");
    }

    @Override
    public String toString() {
        return String.format("%s\nStamina: %d", super.toString(), getStamina());
    }
}
