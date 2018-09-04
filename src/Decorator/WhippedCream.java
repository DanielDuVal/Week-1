// Concrete Decorator

package Decorator;

public class WhippedCream extends CakeDecorator {

Cake cake;
	
	public WhippedCream (Cake cake) {
		this.cake = cake;
	}

	@Override
	public String getDescription() {
		return cake.getdescription() + ", whipped cream";
	}

	@Override
	public double cost() {
		return .10 + cake.cost();
	}
	
}
