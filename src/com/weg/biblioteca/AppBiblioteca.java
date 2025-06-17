package com.weg.biblioteca;
import com.weg.biblioteca.model.Livro;
import com.weg.biblioteca.services.Services;
import com.weg.biblioteca.view.View;

import java.util.List;
import java.util.ArrayList;

public class AppBiblioteca {

	public static void main(String [] args) {
		
		Livro livro = new Livro();
		Services services = new Services();
		View view = new View();
		
		int escolhaMenu;
		
		do {
			
			escolhaMenu = view.menuPrincipal();
			
			services.gerenciamento(escolhaMenu);
			
		} while(escolhaMenu != 4);
		
	}
	
	// FAZER O EDITAR E A CONTAGEM DE DISPONIBILIDADE
	
}
