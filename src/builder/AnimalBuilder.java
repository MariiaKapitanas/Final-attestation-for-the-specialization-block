package builder;

import model.animal.Animal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public abstract class AnimalBuilder<T extends AnimalBuilder<T>> {
    protected String name;
    protected String birthDate;

    public T withName(String name) {
        this.name = name;
        return self();
    }

    public T withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return self();
    }

    protected abstract T self();

    public abstract Animal build();
}
