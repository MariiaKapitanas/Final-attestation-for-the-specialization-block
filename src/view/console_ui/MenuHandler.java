package view.console_ui;

import java.util.Scanner;

public class MenuHandler {
    private final ConsoleUI ui;

    public MenuHandler(ConsoleUI ui) {
        this.ui = ui;
    }

    public void handleMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Add Donkey");
            System.out.println("4. Add Horse");
            System.out.println("5. Show All Animals");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Обработка следующей строки после ввода числа
            switch (choice) {
                case 1:
                    ui.addCat();
                    break;
                case 2:
                    ui.addDog();
                    break;
                case 3:
                    ui.addDonkey();
                    break;
                case 4:
                    ui.addHorse();
                    break;
                case 5:
                    ui.showAllAnimals();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}