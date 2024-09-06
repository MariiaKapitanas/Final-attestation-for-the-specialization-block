package builder;

import model.animal.pet.cat.Cat;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class CatBuilder extends AnimalBuilder<CatBuilder> {
    private String breed;

    public CatBuilder withBreed(String breed) {
        this.breed = breed;
        return self();
    }

    @Override
    protected CatBuilder self() {
        return this;
    }

    @Override
    public Cat build() {
        return new Cat(IdGenerator.generateId(), name, LocalDate.parse(birthDate), breed);
    }
}
