package ativdecorator;

public class Morango extends ItemDecorator {
	
	Food food;
	
	public Morango(Food food) {
		this.food = food;
	}

	@Override
	public String getTs() {
		return food.getTs() + "- Morango";
	}

	@Override
	public double cost() {
		return 5.00 + food.cost();
	}
}