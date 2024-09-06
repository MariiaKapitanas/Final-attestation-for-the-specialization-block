package model.animal.pack_animal;

import model.animal.Animal;
import model.animal.IdGenerator;

import java.time.LocalDate;

public abstract class PackAnimal extends Animal {
    protected final int stamina;

    protected PackAnimal(String id, String name, LocalDate birthDate, int stamina) {
        super(id, name, birthDate);
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public abstract void carryLoad();
}
