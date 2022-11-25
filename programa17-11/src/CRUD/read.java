package CRUD;

import java.util.ArrayList;
import java.util.Scanner;

public class read {
	
	public void listar(ArrayList<String> lista) {
		if(lista.isEmpty()) {
			System.out.println("A lista encontra-se vazia no momento, nenhum item a listar");
			
		} else {
			for(int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
			
			
		}
		
	}
	

}
