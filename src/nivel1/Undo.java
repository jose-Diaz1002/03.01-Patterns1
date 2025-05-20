package nivel1;

import java.util.ArrayList;
import java.util.List;

public class Undo {
    private static Undo undo;
    private List<String> history;

    private Undo(){

        history = new ArrayList<>();
    }

    public static Undo getInstance(){
        if(undo == null){
            undo = new Undo();
        }
        return undo;
    }

    public void addOrder(String order){

        history.add(order);
        System.out.println("Order saved.");

    }

    public void undoOrder(){
        if (history.isEmpty()){

            System.out.println("No orders to delete.");

        }
        else{
            history.remove(history.size()-1);
            System.out.println("Last order deleted");
        }

    }

    public void listOrders(){
        if (history.isEmpty()){
            System.out.println("No orders to show.");
        }
        else{
            for(int i = 0; i < history.size(); i++){
                System.out.println(history.get(i));
            }
        }
    }
}
