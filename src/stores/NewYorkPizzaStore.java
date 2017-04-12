package stores;

import newyorkpizzas.NYCheesePizza;
import newyorkpizzas.NYClamPizza;
import newyorkpizzas.NYPepperoniPizza;
import newyorkpizzas.NYVeggiePizza;
import pizzas.Pizza;

public class NewYorkPizzaStore extends PizzaStore{

	public Pizza createPizza(String pizzatype){
		Pizza pizza = null;
	
		if(pizzatype.equals("cheese")){
			pizza = new NYCheesePizza();
		}else if (pizzatype.equals("pepperoni")){
			pizza = new NYPepperoniPizza();
		}else if (pizzatype.equals("clam")){
			pizza = new NYClamPizza();
		}else if (pizzatype.equals("veggie")){
			pizza = new NYVeggiePizza();
		}
		
		return pizza;
	}

}
