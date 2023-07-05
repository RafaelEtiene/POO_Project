package Cofre;


public class Euro extends Moeda {
	
	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Valor: €" + valor);
	}

	@Override
	public void converter() {
		this.valor *= 5.27;
	}
}
