package builder;

import model.animal.pack_animal.Horse;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class HorseBuilder extends AnimalBuilder<HorseBuilder> {
    private String breed;

    public HorseBuilder withBreed(String breed) {
        this.breed = breed;
        return self();
    }

    @Override
    protected HorseBuilder self() {
        return this;
    }

    @Override
    public Horse build() {
        return new Horse(IdGenerator.generateId(), name, LocalDate.parse(birthDate), breed);
    }
}
