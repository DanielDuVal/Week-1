// Component

package Decorator;

public class CarrotCake extends Cake {

	public CarrotCake() {
		description = "Carrot Cake";
	}
	
	@Override
	public double cost() {
		return 9.99;
	}	
}