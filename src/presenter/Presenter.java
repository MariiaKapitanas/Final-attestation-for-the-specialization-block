package presenter;

import model.animal.Animal;
import service.Service;
import view.View;
import view.console_ui.ConsoleUI;

import java.util.List;

public class Presenter {
    private final Service service;
    private final View view;

    public Presenter(Service service, ConsoleUI view) {
        this.service = service;
        this.view = view;
    }

    public void addAnimal(Animal animal) {
        service.addAnimal(animal);
    }

    public List<Animal> getAllAnimals() {
        return service.getAllAnimals();
    }
}

