package ativdecorator;

public class Acai extends Food {

	public Acai() {
		ts = "Açaí";
	}
	
	@Override
	public double cost() {
		return 10.00;
	}
	
}