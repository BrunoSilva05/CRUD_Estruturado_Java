package OutrasClasses;

import java.util.Scanner;

public class fibonacci {
	
	public void sequenciaDeFibonacci() {
		int casas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número de casas que deseja ver na sequência de Fibonacci: ");
		casas = sc.nextInt();
		
		if(casas <= 2) {
			fibonacciMenorOuIgualADois(casas);
		} else {
			sequenciaFibonacciMaiorQueDois(casas);
		}
	}
	
	public void fibonacciMenorOuIgualADois(int casas) {
		if(casas <= 0) {
			System.out.println("SEQUÊNCIA DE FIBONACCI PRECISA DE PELO MENOS 1 CASA\n");
		} 
		
		if(casas == 1) {
			System.out.println("SEQUÊNCIA DE FIBONACCI: ");
			System.out.print("1\n");
		}
		
		if(casas == 2) {
			System.out.println("SEQUÊNCIA DE FIBONACCI: ");
			System.out.print("1," + " 1\n");
		}
	}
	
	
	public void sequenciaFibonacciMaiorQueDois(int casas) {
		int atual = 1, anterior = 1, antAnterior = 1;
		System.out.print(1 + ", " + 1 + ", ");
		for(int i = 2; i < casas; i++) {
			
			atual = anterior + antAnterior;
			antAnterior = anterior;
			anterior = atual;
			System.out.print(atual + ", ");
		}
		System.out.print("\n");
	}

}
