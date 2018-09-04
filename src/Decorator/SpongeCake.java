// Concrete Component

package Decorator;

public class SpongeCake extends Cake {

	public SpongeCake() {
		description = "Sponge Cake";
	}
	
	@Override
	public double cost() {
		return 9.99;
	}
}
