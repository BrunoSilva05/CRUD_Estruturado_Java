package Program;

import java.util.ArrayList;
import java.util.Scanner;

import CRUD.create;
import CRUD.delete;
import CRUD.read;
import CRUD.update;
import OutrasClasses.fibonacci;
import OutrasClasses.toExchange;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList();
		int option = 1;
		
		create c = new create();
		read r = new read();
		update u = new update();
		delete d = new delete();
		toExchange te = new toExchange();
		fibonacci f = new fibonacci();
		
		System.out.println("SEJA MUITO BEM - VINDO(A)");
		do {
			
		System.out.println("Escolha uma opção: ");
		System.out.println("1 - Listar ");
		System.out.println("2 - Inserir");
		System.out.println("3 - Excluir");
		System.out.println("4 - Alterar");
		System.out.println("5 - Trocar Itens de Lugar");
		System.out.println("6 - Fibonacci");
		System.out.println("0 - Sair do Programa");
		option = sc.nextInt();
		
		switch(option) {
		
		case 0: {
			
			System.out.println("Saindo do Programa. Obrigado por usar...");
			System.out.println(".");
			System.out.println(".");
			System.out.println(".");
			System.exit(0);
			
		}break;
		
		case 1: {
			
			r.listar(lista);
			
		}break;
		
		
		case 2: {
			
			c.inserir(lista);
			
		}break;
		
		
		case 3: {
			
			d.excluir(lista);
			
		}break;
		
		
		
		case 4: {
			
			u.alterar(lista);
			
		}break;
		
		
		
		case 5: {
			
			te.trocarItensdeLugar(lista);
			
		}break;
		
		
		case 6:{
			
			f.sequenciaDeFibonacci();
			
		}break;
		
		
		
		default: {
			
			System.out.println("Opção Inválida. Tente novamente.");
			
		}break;
		
		}// fim do switch
		
		}while(option != 0);
		

	}

}
