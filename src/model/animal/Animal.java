package model.animal;

import java.time.LocalDate;

public abstract class Animal {
    private final String id;
    private final String name;
    private final LocalDate birthDate;

    protected Animal(String id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return String.format("ID: %s\nName: %s\nBirth Date: %s", id, name, birthDate);
    }
}