package Cofre;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cofrinho cofrinho = new Cofrinho();
		
		System.out.println("Cofrinho");
		System.out.println("1 - Adicionar Moeda");
		System.out.println("2 - Remover Moeda");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Calcular total convertido para Real");
		System.out.println("0 - Encerrar");
		Scanner teclado = new Scanner(System.in);
		int opcao = teclado.nextInt();
		while(opcao != 0) {
			switch(opcao) {
			case 1:			
				int opcaoMoeda;
				double valor;
				System.out.printf("Escolha Moeda: \n1-Real: \n2-Dolar: \n3-Euro: \n");
				opcaoMoeda = teclado.nextInt();
				
				if(opcaoMoeda == 1) {
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Real real = new Real(valor);
					cofrinho.adicionar(real);
				}
				else if(opcaoMoeda == 2){
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Dolar dolar = new Dolar(valor);
					cofrinho.adicionar(dolar);
				}
				else {
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Euro euro = new Euro(valor);
					cofrinho.adicionar(euro);
				}
				break;
			case 2:
				System.out.printf("Escolha Moeda: \n1-Real: \n2-Dolar: \n3-Euro: \n");
				opcaoMoeda = teclado.nextInt();
				
				if(opcaoMoeda == 1) {
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Real real = new Real(valor);
					cofrinho.remover(real);
				}
				else if(opcaoMoeda == 2){
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Dolar dolar = new Dolar(valor);
					cofrinho.remover(dolar);
				}
				else {
					System.out.println("Digite o valor: \n");
					valor = teclado.nextDouble();
					Euro euro = new Euro(valor);
					cofrinho.remover(euro);
				}
				break;
				
			case 3:
				cofrinho.listagemMoedas();
				break;
				
			case 4:
				double total = cofrinho.totalConvertido();
				System.out.println("Valor total convertido: " + total);
				break;
			default:
				System.out.println("Opção invalida!");
			} 
			
			System.out.println("Cofrinho");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido para Real");
			System.out.println("0 - Encerrar \n");
			opcao = teclado.nextInt();
			
				
		}
	}

}
