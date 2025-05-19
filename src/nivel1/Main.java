package nivel1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String order;
        Undo undo = Undo.getInstance();
        Menu menu = Menu.getInstance();

        boolean out = false;

        do{
            switch(menu.app()){
                case 1:
                    System.out.println("enter the order:");
                    order = scanner.nextLine();
                    undo.addOrder(order);
                    break;
                case 2: undo.undoOrder();
                    break;
                case 3: undo.listOrders();
                    break;
                case 0: System.out.println("Thank you for using the app.");
                    out = true;
                    break;
                }
        }while(!out);

    }

}