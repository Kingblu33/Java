package zookeeper;

public class Mammals {
  private int energyLevel;
  
  public Mammals(){
	  this.energyLevel=100;
  }
  
  public int getEnergy() {
	   
	return this.energyLevel;
  }
  
  public int encrementenergy(int energy) {
	  this.energyLevel += energy;
	  return this.energyLevel;
  }
  
  public int decrementenergy(int energy) {
	  this.energyLevel -= energy;
	  return this.energyLevel;
  }
  
  public int setenergy(int energy) {
	  
	  return this.energyLevel= energy;
	  
  }
 
  
}
