package Cofre;


public class Real extends Moeda {
	
	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: R$" + valor);
	}

	@Override
	public void converter() {
	}
}
