package Cofre;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) throws Exception {
		try {
			if(moeda.valor <= 0)
				throw new Exception("Por favor, adicione uma moeda com um valor acima de 0");
				
			listaMoedas.add(moeda);
		} catch (Exception e) {
			throw new Exception("Ocorreu um erro antes de inserir na lista!");
		}
		
	}
	
	public void remover(Moeda moeda) throws Exception {
		if(moeda.valor <= 0)
			throw new Exception("Valor inválido. Tente novamente!");
		
		listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() {
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda.valor);
		}
	}
	
	public double totalConvertido() throws Exception {
		double valorTotal = 0;
		
		if(listaMoedas.isEmpty())
			throw new Exception("Não há nenhuma moeda cadastrada.");
		
		for(Moeda moeda: listaMoedas) {
			if(moeda instanceof Euro || moeda instanceof Dolar) {
				moeda.converter();
			}
			valorTotal += moeda.valor;
		}
		return valorTotal;
	}
}
