package zookeeper;

public class Batman extends Mammals{	
	public Batman(){
		super.setenergy(300);
		System.out.println("Created Batman Default Energy is 300");

	}
	
	public void fly() {
		
		System.out.println("Batman just took Off Sheeshhhhh");
		super.decrementenergy(50);
		int energy = super.getEnergy();
		
		System.out.println("Flying makes batman  lose eneryg Current Engery:" +energy);
	}
	public void eathumans() {
		System.out.println("I thought Batman Didnt kill People??????");
		super.encrementenergy(25);
		int energy = super.getEnergy();
		
		System.out.println("Apparentlyt Batman eats People here is more health:" +energy);
	}
	
	public void attacktown() {
		
		System.out.println("Isnt th is what the joker does?? Batman Attacks the town!!!");
		super.decrementenergy(100);
		int energy = super.getEnergy();
		
		System.out.println("Batman attacks town:" +energy);
	}
	
}
