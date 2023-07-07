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
