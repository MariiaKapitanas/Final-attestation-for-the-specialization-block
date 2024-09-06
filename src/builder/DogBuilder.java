package builder;

import model.animal.pet.dog.Dog;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class DogBuilder extends AnimalBuilder<DogBuilder> {
    private String breed;

    public DogBuilder withBreed(String breed) {
        this.breed = breed;
        return self();
    }

    @Override
    protected DogBuilder self() {
        return this;
    }

    @Override
    public Dog build() {
        return new Dog(IdGenerator.generateId(), name, LocalDate.parse(birthDate), breed);
    }
}
