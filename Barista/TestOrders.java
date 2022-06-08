import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("cappucino", 13.5);
        Item item2 = new Item("Mocha", 9.5);
        Item item3 = new Item("Latte", 10.5);
        Item item4 = new Item("Drip Coffee", 12.0);
        Item item5 = new Item(); 
        System.out.println(item5.getName());
        System.out.println(item5.getPrice());
       //Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();
        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Anna");
        Order order4 = new Order("Emilie");
        Order order5 = new Order("Coco");
        //Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        /****************************************************Order 1 *************************************************************** */
        System.out.println("****************************************************Order 1 *************************************************************** *");
        order1.addItem(item1);
        order1.addItem(item4);
        order1.setReady(false);
        System.out.println(order1.getStatusMessage());
        order1.display();
        System.out.println("*************************************************************************************************************************");
        /************************************************************************************************************************ */
        /****************************************************Order 2 *************************************************************** */
        System.out.println("\n****************************************************Order 2 *************************************************************** *");
        order2.addItem(item2);
        order2.addItem(item3);
        order1.setReady(false);
        System.out.println(order2.getStatusMessage());
        order1.display();
        System.out.println("*************************************************************************************************************************");
        /************************************************************************************************************************ */
        /****************************************************Order 3 *************************************************************** */
        System.out.println("\n****************************************************Order 3 ****************************************************************");
        order3.addItem(item2);
        order3.addItem(item1);
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());
        order3.display();
        System.out.println("*************************************************************************************************************************");
        /************************************************************************************************************************ */
        /****************************************************Order 4 *************************************************************** */
        order4.addItem(item4);
        order4.addItem(item2);
        order4.setReady(true);
        System.out.println(order4.getStatusMessage());
        order4.display();
        System.out.println("*************************************************************************************************************************");
        /************************************************************************************************************************ */
        /****************************************************Order 5 *************************************************************** */
        System.out.println("\n****************************************************Order 5 ****************************************************************");
        item1.setName("Brpppp");
        System.out.println("Items 1 change:"+item1.getPrice());
        order5.addItem(item3);
        order5.addItem(item1);
        order5.setReady(false);
        System.out.println(order5.getStatusMessage());
        order5.display();
        System.out.println("*************************************************************************************************************************");
        /************************************************************************************************************************ */
    }
}
