package nivel1;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final Undo undo;
    private boolean exit = false;

    public Menu() {
        scanner = new Scanner(System.in);
        undo = Undo.getInstance();
    }

    public void start() {
        while (!exit) {
            byte option = getOption();
            handleOption(option);
        }
        scanner.close();
    }

    private byte getOption() {
        byte option = -1;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add order");
            System.out.println("2. Undo last order");
            System.out.println("3. List orders");
            System.out.println("0. Exit");
            try {
                option = Byte.parseByte(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        } while (option < 0 || option > 3);
        return option;
    }

    private void handleOption(byte option) {
        switch (option) {
            case 1:
                System.out.println("Enter the order:");
                String order = scanner.nextLine();
                undo.addOrder(order);
                break;
            case 2:
                undo.undoOrder();
                break;
            case 3:
                undo.listOrders();
                break;
            case 0:
                System.out.println("Exiting...");
                exit = true;
                break;
        }
    }
}


