package service;

import model.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private final List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAllAnimals() {
        return new ArrayList<>(animals);
    }
}
