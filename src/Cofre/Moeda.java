package Cofre;

public abstract class Moeda {
	double valor;
	
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	public abstract void info();
	
	public abstract void converter();

}
