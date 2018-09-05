// Concrete Decorator

package Decorator;

public class Strawberries extends CakeDecorator {

	Cake cake;
	
	public Strawberries(Cake cake) {
		this.cake = cake;
	}

	public String getDescription() {
		return cake.getDescription() + ", strawberries";
	}

	public double cost() {
		return .50 + cake.cost();
	}
}