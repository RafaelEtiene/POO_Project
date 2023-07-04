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

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
