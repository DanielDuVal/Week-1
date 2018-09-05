// Component

package Decorator;

public abstract class Cake {

	String description = "Unknown Good";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}

