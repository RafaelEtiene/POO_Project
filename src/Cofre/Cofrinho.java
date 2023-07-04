package Cofre;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for(Moeda moeda : listaMoedas) {
			moeda.info();
		}
	}
	
	public double totalConvertido() {
		double valorTotal = 0;
		for(Moeda moeda: listaMoedas) {
			if(moeda instanceof Euro && moeda instanceof Dolar) {
				moeda.converter();
			}
			valorTotal += moeda.valor;
		}
		return valorTotal;
	}

}
