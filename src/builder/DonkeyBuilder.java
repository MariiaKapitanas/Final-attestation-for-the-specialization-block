package builder;

import model.animal.pack_animal.Donkey;
import model.animal.IdGenerator;

import java.time.LocalDate;

public class DonkeyBuilder extends AnimalBuilder<DonkeyBuilder> {
    private int stamina;

    public DonkeyBuilder withStamina(int stamina) {
        this.stamina = stamina;
        return self();
    }

    @Override
    protected DonkeyBuilder self() {
        return this;
    }

    @Override
    public Donkey build() {
        return new Donkey(IdGenerator.generateId(), name, LocalDate.parse(birthDate), stamina);
    }
}
