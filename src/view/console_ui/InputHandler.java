package view.console_ui;

import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    // Метод для чтения строки
    public String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Метод для чтения числа
    public int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Метод для подтверждения действий
    public boolean getConfirmation(String prompt) {
        System.out.print(prompt + " (y/n): ");
        String input = scanner.next().toLowerCase();
        return input.equals("y");
    }
}