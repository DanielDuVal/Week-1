// Concrete Component

package Decorator;

public class AngelFoodCake extends Cake {

	public AngelFoodCake() {
		description = "Angel Food Cake";
	}
	
	@Override
	public double cost() {
		return 7.99;
	}
}
