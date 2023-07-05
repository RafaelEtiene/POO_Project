package Cofre;

public class Dolar extends Moeda {
	
	public Dolar(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: $" + valor);
	}

	@Override
	public void converter() {
		valor *= 4.84;
	}
}
