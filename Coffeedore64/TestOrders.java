import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {

        CoffeeKiosk coffeinst = new CoffeeKiosk();

        coffeinst .addMenuItem("banana", 2.00);
        coffeinst .addMenuItem("coffee", 2.5);
        coffeinst .addMenuItem("capuccino", 3.0);
        coffeinst.addMenuItem("muffin", 4.0);

        
        coffeinst .addMenuItemByInput();
        coffeinst .newOrder();
    }
}
