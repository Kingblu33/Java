import java.util.ArrayList;

public class CafeUtil{

    public  int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i <= 10 ; i++){
    
            sum= sum +i;
            
        }
    return sum;
    }
    public double getOrderTotal(double[]lineItems){
        double total = 0.0 ;
        for(int i= 0 ;i <= lineItems.length - 1; i++){
            double temp = lineItems[i];
            total = total + temp;
        }
        
        return total;
    }
    public void displayMenu(ArrayList<String> menu){
        for(int i= 0; i < menu.size()-1; i++){
            System.out.println(i  +  menu.get(i));
        }
        
    }
    public void addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine();
        customers.add(userName);
        if (customers.size()==4){
            System.out.println(customers);
        }
        
    }
}