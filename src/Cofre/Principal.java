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
			int opcaoMoeda;
			double valor;
			switch(opcao) {
			case 1:
				System.out.printf("Escolha Moeda: \n1-Real: \n2-Dolar: \n3-Euro: ");
				opcaoMoeda = teclado.nextInt();
				System.out.println("Digite o valor: ");
				valor = teclado.nextDouble();
				
				if(opcaoMoeda == 1) {
					Real real = new Real(valor);
					cofrinho.adicionar(real);
				}
				else if(opcaoMoeda == 2){
					Dolar dolar = new Dolar(valor);
					cofrinho.adicionar(dolar);
				}
				else {
					Euro euro = new Euro(valor);
					cofrinho.adicionar(euro);
				}
				break;
				
			case 2:
				
			} 
			
				
		}
	}

}
