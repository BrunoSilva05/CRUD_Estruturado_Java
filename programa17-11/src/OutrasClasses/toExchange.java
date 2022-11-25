package OutrasClasses;

import java.util.ArrayList;
import java.util.Scanner;

public class toExchange {

	public void trocarItensdeLugar(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			
			Scanner sc = new Scanner(System.in);
			String item1;
			
			System.out.println("Digite o primeiro item:");
			item1 = sc.next();
			
			if(lista.contains(item1)) {
				seListaContemItem1(lista, item1, sc);
			} else {
				seListaNaoContemItem1(lista, item1, sc);
			}
		}
		
		
	}
	
	public void seListaContemItem1(ArrayList<String> lista, String item1, Scanner sc) {
		String item2;
		System.out.printf("Digite outro item na lista para ser trocado de lugar com %s na lista\n", item1);
		item2 = sc.next();
		
		if(lista.contains(item2)) {
			seListaContemItem2(lista, item1, item2, sc);
		} else {
			seListaNaoContemItem2(lista, item1, item2, sc);
		}
	}
	
	public void seListaNaoContemItem1(ArrayList<String> lista, String item1, Scanner sc) {

		int opc;
		System.out.printf("O item %s não está presente na lista, Digite outro número ou retorne ao menu inicial.\n", item1);
		System.out.println("1 - Digitar outro número");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		
		case 1: {
			
			trocarItensdeLugar(lista);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente Novamente.");
			seListaNaoContemItem1(lista, item1, sc);
			
		}break;
		
		}
	}
	
	
	
	public void seListaContemItem2(ArrayList<String> lista, String item1, String item2, Scanner sc) {
		
		int indice1=0, indice2=0;
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equals(item1)) {
				indice1 = i;
			}
			
			if(lista.get(i).equals(item2)) {
				indice2 = i;
			}
		}
		
		lista.set(indice1, item2);
		lista.set(indice2, item1);
		System.out.printf("itens %s e %s trocados de lugar na lista Com Sucesso!!!\n", item1, item2);
		
	}
	
	public void seListaNaoContemItem2(ArrayList<String> lista, String item1, String item2, Scanner sc) {
		int opc;
		System.out.printf("%s não está presente na lista, digite outro item ou retorne ao menu inicial\n", item2);
		System.out.println("1 - Digite outro item");
		System.out.println("2 - Retorne ao menu inicial");
		opc = sc.nextInt();
		
		
		switch(opc) {
		
		case 1: {
			seListaContemItem1(lista, item1, sc);
		}break;
		
		case 2: {
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			System.out.println("Opção Inválida. Tente novamente.");
			seListaNaoContemItem2(lista, item1, item2, sc);
			
		}break;
		
		}
	}
	
}
		
	
	
	

