// Driver

package Decorator;

public class Orders {

	public static void main(String[] args) {

		Cake firstCake = new CarrotCake();
		System.out.println(firstCake.getDescription() + " $" + firstCake.cost());
		
		Cake secondCake = new AngelFoodCake();
		secondCake = new Strawberries(secondCake);
		secondCake = new WhippedCream(secondCake);
		System.out.println(secondCake.getDescription() + " $" + secondCake.cost());
		
		Cake thirdCake = new SpongeCake();
		thirdCake = new Icing(thirdCake);
		System.out.println(thirdCake.getDescription() + " $" + secondCake.cost());
	}
}
