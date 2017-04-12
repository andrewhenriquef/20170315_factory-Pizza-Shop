package stores;

import chicagopizzas.*;
import pizzas.Pizza;

public class ChicagoPizzaStore extends PizzaStore{

	public Pizza createPizza(String pizzatype){
		Pizza pizza = null;
	
		if(pizzatype.equals("cheese")){
			pizza = new CHICheesePizza();
		}else if (pizzatype.equals("pepperoni")){
			pizza = new CHIPepperoniPizza();
		}else if (pizzatype.equals("clam")){
			pizza = new CHIClamPizza();
		}else if (pizzatype.equals("veggie")){
			pizza = new CHIVeggiePizza();
		}
		
		return pizza;
	}

}
