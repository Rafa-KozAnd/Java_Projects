package ativdecorator;

public class Banana extends ItemDecorator {
	
	Food food;
	
	public Banana(Food food) {
		this.food = food;
	}

	@Override
	public String getTs() {
		return food.getTs() + "- Banana";
	}

	@Override
	public double cost() {
		return 2.00 + food.cost();
	}
}