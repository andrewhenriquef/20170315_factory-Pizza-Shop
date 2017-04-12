package application;

import stores.*;

public class App {

	public static void main(String[] args) {

		PizzaStore nystore = new NewYorkPizzaStore();
		nystore.orderPizza("pepperoni");

		System.out.println("--------------------------->");
		
		PizzaStore castore = new CaliforniaPizzaStore();
		castore.orderPizza("cheese");
		
		System.out.println("--------------------------->");
		
		PizzaStore chistore = new ChicagoPizzaStore();
		chistore.orderPizza("veggie");
		
		System.out.println("--------------------------->");
		
		chistore.orderPizza("clam");
		
	}

}
