package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class delete {

	public void excluir(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			String item;
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o item que deseja excluir da lista: ");
			item = sc.nextLine();
			
			if(lista.contains(item)) {
				lista.remove(item);
				System.out.printf("item %s removido da lista Com Sucesso!!!", item);
			} else {
				
				seListaNaoContemItem(item, lista, sc);
			}
			
			
		}
		
	}
	
	
	public void seListaNaoContemItem(String item, ArrayList<String> lista, Scanner sc) {
		int opc;
		System.out.printf("O item %s não está presente na lista", item);
		System.out.println("Digite outro item ou retorne ao menu inicial.");
		System.out.println("1 - Digitar outro número");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		
		switch(opc) {
		
		case 1: {
			this.excluir(lista);
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. tente novamente.");
			this.seListaNaoContemItem(item, lista, sc);
			
		}break;
		
		
		}
	}
}
