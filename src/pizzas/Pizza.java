package pizzas;

public abstract class Pizza {

	public abstract String getDescription(); 
	
	public String prepare(){
		return "Montando a Pizza!";
	}
	
	public String bake(){
		return "Assando a Pizza!";
	}
	
	public String cut(){
		return "Cortando a Pizza!";
	}
	
	public String box(){
		return "Embalando a Pizza!";
	}
	
}
