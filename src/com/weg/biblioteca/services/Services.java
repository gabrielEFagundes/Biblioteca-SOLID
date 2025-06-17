package com.weg.biblioteca.services;
import com.weg.biblioteca.model.Livro;
import com.weg.biblioteca.view.View;

import java.util.List;
import java.util.ArrayList;

public class Services {
	
	Livro livro = new Livro();
	List<Livro> meusLivros = new ArrayList<>();
	
	public void gerenciamento(int escolhaMenu) {
		
		switch(escolhaMenu) {
		
		case 1 -> {
			
			String tituloLivro = View.cadastrarNome();
			
			String autorLivro = View.cadastrarAutor();
			
			double precoLivro = View.cadastrarPreco();
			
			int anoLancamentoLivro = View.cadastrarAnoLancamento();
			
			int disponivel = View.cadastrarDisponibilidade();
			
			boolean disponibilidadeLivro;
			
			if(disponivel == 1) {
				disponibilidadeLivro = true;
				
			}else if(disponivel == 0) {
				disponibilidadeLivro = false;
				
			}else {
				disponibilidadeLivro = false;
				
			}
			
			Livro livro = new Livro(tituloLivro, autorLivro, precoLivro, anoLancamentoLivro, disponibilidadeLivro);
			
			meusLivros.add(livro);
			
		}
		
		case 2 -> {
			
			int listagem = View.listarEscolha();
			
			if(listagem == 1) {
				View.listarLivrosPorTitulo(meusLivros, livro);
				
			}else if(listagem == 2) {
				View.listarLivrosPorAutor(meusLivros, livro);
				
			}else {
				View.erroListagem();
			}
			
		}
		
		case 3 -> {
			
			String tituloDel = View.removerLivros(meusLivros);
			
			for(int i = 0; i < meusLivros.size(); i++) {
				
				String livroAtual = livro.getTitulo();
				
				if(livroAtual.equalsIgnoreCase(tituloDel)) {
					meusLivros.remove(i);
				}
				
			}
			
		}
		
		case 4 -> {
			
			View.sairDoPrograma();
			
		}
		
		default -> {
			
			System.err.println("\nDigite um valor correto.");
			
		}
		
		}
		
	}

}
