public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = " Welcome to Cafe Java, ";
        String pendingMessage = " your order will be ready shortly";
        String readyMessage = " your order is ready";
        String displayTotalMessage = "  Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 5.5;
        double latte = 6.5;
        double capuccino = 2.5;
        double sum4;
        double sum5;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if(isReadyOrder1 == false){
            System.out.println(pendingMessage + customer1 );
        }
        if(isReadyOrder4 ==true){
            System.out.println(readyMessage + customer4);
        }
        else{
            System.out.println(pendingMessage + customer4 );
        }
        sum4 = latte * 2;
        if(isReadyOrder2==false){
            System.out.println(customer2 + displayTotalMessage  +sum4);
        }
    	// ** Your customer interaction print statements will go here ** //
        sum5 = latte-dripCoffee;
        System.out.println(customer3 + displayTotalMessage + sum5);
    }
}
