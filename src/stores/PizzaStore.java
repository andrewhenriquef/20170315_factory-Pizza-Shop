package stores;

import pizzas.Pizza;

public abstract class PizzaStore {

	protected abstract Pizza createPizza(String pizzatype);
	
	//order pizza
	public Pizza orderPizza(String pizzatype){
		
		Pizza pizza;
		
		pizza = createPizza(pizzatype);
		
		getData(pizza);
		
		return pizza;
	}
	
	

	//print pizza data
	public void getData(Pizza pizza){
		System.out.println(pizza.getDescription() +
				"\n" +
				pizza.prepare() +
				"\n" +
				pizza.bake() +
				"\n" +
				pizza.cut() +
				"\n" +
				pizza.box());
	}
}
