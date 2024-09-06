package view.console_ui;

import builder.CatBuilder;
import builder.DogBuilder;
import builder.DonkeyBuilder;
import builder.HorseBuilder;
import model.animal.Animal;
import model.animal.pet.cat.Cat;
import model.animal.pet.dog.Dog;
import model.animal.pack_animal.Donkey;
import model.animal.pack_animal.Horse;
import presenter.Presenter;
import service.Service;
import view.View;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI implements View {
    private final Presenter presenter;
    private final Scanner scanner = new Scanner(System.in);

    public ConsoleUI() {
        Service service = new Service();
        this.presenter = new Presenter(service, this);
    }

    @Override
    public void startWork() {
        while (true) {
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Add Donkey");
            System.out.println("4. Add Horse");
            System.out.println("5. Show All Animals");
            System.out.println("6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCat();
                    break;
                case 2:
                    addDog();
                    break;
                case 3:
                    addDonkey();
                    break;
                case 4:
                    addHorse();
                    break;
                case 5:
                    showAllAnimals();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    void addCat() {
        System.out.print("Enter cat name: ");
        String name = scanner.nextLine();
        System.out.print("Enter cat birth date (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter cat breed: ");
        String breed = scanner.nextLine();

        Cat cat = new CatBuilder()
                .withName(name)
                .withBirthDate(birthDate.toString())
                .withBreed(breed)
                .build();

        presenter.addAnimal(cat);
    }

    void addDog() {
        System.out.print("Enter dog name: ");
        String name = scanner.nextLine();
        System.out.print("Enter dog birth date (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter dog breed: ");
        String breed = scanner.nextLine();

        Dog dog = new DogBuilder()
                .withName(name)
                .withBirthDate(birthDate.toString())
                .withBreed(breed)
                .build();

        presenter.addAnimal(dog);
    }

    void addDonkey() {
        System.out.print("Enter donkey name: ");
        String name = scanner.nextLine();
        System.out.print("Enter donkey birth date (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter donkey stamina: ");
        int stamina = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Donkey donkey = new DonkeyBuilder()
                .withName(name)
                .withBirthDate(birthDate.toString())
                .withStamina(stamina)
                .build();

        presenter.addAnimal(donkey);
    }

    void addHorse() {
        System.out.print("Enter horse name: ");
        String name = scanner.nextLine();
        System.out.print("Enter horse birth date (yyyy-mm-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());
        System.out.print("Enter horse breed: ");
        String breed = scanner.nextLine();

        Horse horse = new HorseBuilder()
                .withName(name)
                .withBirthDate(birthDate.toString())
                .withBreed(breed)
                .build();

        presenter.addAnimal(horse);
    }

    @Override
    public void printAnimal(Animal animal) {
        System.out.println(animal);
    }

    @Override
    public void showAllAnimals() {
        List<Animal> animals = presenter.getAllAnimals();
        if (animals.isEmpty()) {
            System.out.println("No animals found.");
        } else {
            for (Animal animal : animals) {
                printAnimal(animal);
            }
        }
    }
}
