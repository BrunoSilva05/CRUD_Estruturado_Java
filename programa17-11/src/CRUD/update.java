package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class update {

	public void alterar(ArrayList<String> lista) {
		
		if(lista.isEmpty()) {
			
			System.out.println("A lista encontra-se vazia no momento.");
		} else {
			Scanner sc = new Scanner(System.in);
			String item;
			
			System.out.println("Digite o item a ser alterado na lista: ");
			item = sc.nextLine();
			
			if(lista.contains(item)) {
				seListaJaContemItem(lista, item, sc);
			} else {
				seListaNaoContemItem(lista, item, sc);
			}
		}
		
	}
	
	public void seListaJaContemItem(ArrayList<String> lista, String item, Scanner sc) {
		String newItem;
		System.out.printf("Digite o novo item que substituirá o item %s na lista \n", item);
		newItem = sc.next();
		
		if(lista.contains(newItem)) {
			seListaJaContemNewItem(lista, item, newItem, sc);
		} else {
			seListaNaoContemNewItem(lista, item, newItem, sc);
		}
	}
	
	public void seListaNaoContemItem(ArrayList<String> lista, String item, Scanner sc) {
		int opc;
		System.out.printf("O item %s não está presente na lista, Digite outro item ou retorne ao menu inicial \n", item);
		System.out.println("1 - Digite outro item");
		System.out.println("2 - Retorne ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		
		case 1: {
			
			alterar(lista);
			
		}break;
		
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente!");
			seListaNaoContemItem(lista, item, sc);
			
		}break;
		
		
		}
	}
	
	public void seListaJaContemNewItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		int opc;
		System.out.printf("O item %s já está presente na lista, digite outro item ou retorne ao menu inicial \n", newItem);
		System.out.println("1 - Digitar outro item");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			seListaJaContemItem(lista, item, sc);
			
		}break;
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
			
		}break;
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente!");
			seListaJaContemNewItem(lista, item, newItem, sc);
			
		}break;
		
		}
	} 
	
	
	public void seListaNaoContemNewItem(ArrayList<String> lista, String item, String newItem, Scanner sc) {
		
		for(int i = 0; i < lista.size(); i++) {
			if(lista.get(i).equals(item)) {
				lista.set(i, newItem);
			}
		}
		
		System.out.printf("item %s trocado na lista por %s Com Sucesso!!!", item, newItem);
	}
}
