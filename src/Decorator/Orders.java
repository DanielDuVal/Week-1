// Driver

package Decorator;

public class Orders {

	public static void main(String[] args) {

		Cake firstCake = new CarrotCake();
		System.out.println(firstCake.getdescription() + "$" + firstCake.cost());
		
		Cake secondCake = new AngelFoodCake();
		secondCake = new Strawberries(secondCake);
		secondCake = new WhippedCream(secondCake);
		System.out.println(secondCake.getdescription() + "$" + secondCake.cost());
		
		Cake thirdCake = new SpongeCake();
		thirdCake = new Icing(thirdCake);
	}

}
