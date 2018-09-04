// Concrete Decorator

package Decorator;

public class Strawberries extends CakeDecorator {

	Cake cake;
	
	public Strawberries (Cake cake) {
		this.cake = cake;
	}

	@Override
	public String getDescription() {
		return cake.getdescription() + ", strawberries";
	}

	@Override
	public double cost() {
		return .50 + cake.cost();
	}
}