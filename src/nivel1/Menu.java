package nivel1;


import java.util.Scanner;

public class Menu {
    private static Menu menu;
    private Menu(){

    }
    public static Menu getInstance(){

        if(menu == null){
            menu = new Menu();
        }
        return menu;
    }

    public byte app(){
        Scanner scanner = new Scanner(System.in);
        byte option;
        final byte MINIMUN = 0;
        final byte MAXIMUM = 3;

        do{
            System.out.println("\ntype the number of the operation you want to do");
            System.out.println("option 1. Add order");
            System.out.println("option 2. Undo last order");
            System.out.println("option 3. List orders");
            System.out.println("option 0. Exit the application.\n");
            option = scanner.nextByte();
            if(option < MINIMUN || option > MAXIMUM){
                System.out.println("Choose a valid option.");
            }

        }while(option < MINIMUN || option > MAXIMUM);
        return option;
    }

}
