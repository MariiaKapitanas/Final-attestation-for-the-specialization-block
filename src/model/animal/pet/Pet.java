package model.animal.pet;

import model.animal.Animal;

import java.time.LocalDate;

public abstract class Pet extends Animal {
    protected Pet(String id, String name, LocalDate birthDate) {
        super(id, name, birthDate);
    }
}

