package ativdecorator;

public abstract class food {
	
	String ts = "açai do Indio";
	
	public String getTs() {
		return this.ts;
	}
	
	public abstract double cost();

}