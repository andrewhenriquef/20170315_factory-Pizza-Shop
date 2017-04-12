package stores;

import californiapizzas.*;
import pizzas.Pizza;

public class CaliforniaPizzaStore extends PizzaStore{

	public Pizza createPizza(String pizzatype){
		Pizza pizza = null;
	
		if(pizzatype.equals("cheese")){
			pizza = new CACheesePizza();
		}else if (pizzatype.equals("pepperoni")){
			pizza = new CAPepperoniPizza();
		}else if (pizzatype.equals("clam")){
			pizza = new CAClamPizza();
		}else if (pizzatype.equals("veggie")){
			pizza = new CAVeggiePizza();
		}
		
		return pizza;
	}
	
}
