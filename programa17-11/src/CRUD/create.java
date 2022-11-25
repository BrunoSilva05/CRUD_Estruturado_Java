package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class create {

public void inserir(ArrayList<String> lista) {
		
		String item;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o item que deseja inserir na lista: ");
		item = sc.nextLine();
		
		if(lista.contains(item)) {
			seListaJaContemItem(item, sc, lista);
		} else {
			lista.add(item);
			System.out.println("item " + item + " adicionado a lista com sucesso");
		}
	}
	
	
	
	public void seListaJaContemItem(String item, Scanner sc, ArrayList lista) {
		
		int opc;
		System.out.println("Este item já está presente na lista, escolha outro item ou retorne para o menu inicial.");
		System.out.println("1 - Digitar outro item");
		System.out.println("2 - Retornar ao menu inicial");
		opc = sc.nextInt();
		
		switch(opc) {
		
		case 1: {
			
			this.inserir(lista);
			
		}break;
		
		
		
		case 2: {
			
			System.out.println("Retornando ao menu inicial...");
		}break;
		
		
		default: {
			System.out.println("Opção Inválida, tente novamente.");
			this.seListaJaContemItem(item, sc, lista);
		}break;
		
		
		}//fim do switch
		
	}
}
