//Concrete Decorator

package Decorator;

public class Icing extends CakeDecorator{

	Cake cake;
	
	public Icing (Cake cake) {
		this.cake = cake;
	}
	
	@Override
	public String getDescription() {
		return cake.getdescription() + ", icing";
	}

	@Override
	public double cost() {
		return .30 + cake.cost();
	}
}
