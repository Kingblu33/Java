package zookeeper;

public class Gorilla extends Mammals {

	public void throwSomething() {
		System.out.println("Gorilla is throwing a item");
		super.decrementenergy(10);
		int energy=super.getEnergy();
		System.out.println("Current Health:" + energy );
		System.out.println("LOOOSINGGG POWEERERRRR!!!!!");
		
	}
	
	public void eatbanan() {
		
		System.out.println("Gorilla is about to eat a bannana ");
		
		super.encrementenergy(10);	
		
		 int energy =super.getEnergy();
		System.out.println("Current Health:" + energy ); 
		
		System.out.println("SO MUUUCH POWEERWRWRWRRRRR!!!!!");
		
	}
	
	public void climb() {
		System.out.println("Gorilla is currently Clmbing");
		super.decrementenergy(10);
		
		int energy = super.getEnergy();
		System.out.println("Current Health:" + energy ); 
		
		System.out.println("LOOOSINGGG POWEERERRRR!!!!!");
		
	}
}
