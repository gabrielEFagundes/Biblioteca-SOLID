package com.weg.biblioteca.view;
import com.weg.biblioteca.model.Livro;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
	
	public static Scanner scan = new Scanner(System.in);
	
	public int menuPrincipal() {
		
		System.out.println("\n==== BIBLIOTECA SOLID ===="
				+ "\n1- Cadastrar livro novo"
				+ "\n2- Listar todos os livros"
				+ "\n3- Remover livro por título"
				+ "\n4- Sair"
				+ "\nSua escolha: ");
		
		int escolhaMenu = scan.nextInt();
		
		return escolhaMenu;
		
	}
	
	public static String cadastrarNome() {
		
		scan.nextLine();
		
		System.out.println("\nDigite o título do livro: ");
		String titulo = scan.nextLine();
		
		return titulo;
		
	}
	
	public static String cadastrarAutor() {
		
		System.out.println("\nDigite o nome do autor: ");
		String autor = scan.nextLine();
		
		return autor;
		
	}
	
	public static double cadastrarPreco() {
		
		System.out.println("\nDigite o preço do livro: ");
		double preco = scan.nextDouble();
		
		return preco;
		
	}
	
	public static int cadastrarAnoLancamento() {
		
		System.out.println("\nDigite o ano de lançamento do livro: ");
		int anoLancamento = scan.nextInt();
		
		return anoLancamento;
		
	}
	
	public static int cadastrarDisponibilidade() {
		
		System.out.println("\nDigite se o livro está disponível (1-Sim/0-Não): ");
		int disponibilidade = scan.nextInt();
		
		return disponibilidade;
		
	}
	
	public static int listarEscolha() {
		System.out.println("\nComo você deseja fazer a pesquisa?"
				+ "\n1- Por título"
				+ "\n2- Por Autor"
				+ "\nSua escolha: ");
		
		int listarEscolha = scan.nextInt();
		
		return listarEscolha;
	}
	
	public static void listarLivrosPorTitulo(List<Livro> meusLivros, Livro livro) {
		
		scan.nextLine();
		
		System.out.println("\nDigite o título do livro: ");
		String tituloLivro = scan.nextLine();
		
		System.out.println("\n====================================================================");
		System.out.println("\nTitulo\t\tAutor\t\tPreco\t\tAno de Lançamento\t\tDisponível?\n");
		
		for(Livro i : meusLivros) {
			String tituloAtual = i.getTitulo();
			
			if(tituloAtual.equalsIgnoreCase(tituloLivro)) {
				System.out.println(i.getTitulo() + "\t\t" + i.getAutor() + "\t\t" + i.getPreco() + "\t\t" + i.getAnoLancamento() + "\t\t" + i.getDisponibilidade());
					
			}
		}
		System.out.println("\n====================================================================");
		
	}
	
	public static void listarLivrosPorAutor(List<Livro> meusLivros, Livro livro) {
		
		scan.nextLine();
		
		System.out.println("\nDigite o nome do autor: ");
		String autorLivro = scan.nextLine();
		
		System.out.println("\\n====================================================================");
		System.out.println("\nTitulo\t\tAutor\t\tPreço\t\tAno de Lançamento\t\tDisponível?\n");
		
		for(Livro i : meusLivros) {
			String autorAtual = i.getAutor();
			
			if(autorAtual.equalsIgnoreCase(autorLivro)) {
				System.out.println(i.getTitulo() + "\t\t" + i.getAutor() + "\t\t" + i.getPreco() + "\t\t" + i.getAnoLancamento() + "\n\n" + i.getDisponibilidade());
			}
		}
		System.out.println("\\n====================================================================");
		
	}
	
	public static void erroListagem() {
		System.err.println("\nErro: Escolha um valor correto.\n");
		
	}
	
	public static String removerLivros(List<Livro> meusLivros) {
		
		System.out.println("\n=======================================\n");
		
		for(Livro i : meusLivros) {
			System.out.println(i.getTitulo() + "\n");
		}
		
		System.out.println("=======================================\n");
		
		System.out.println("\nDigite o título do livro que você quer digitar: ");
		String tituloDel = scan.nextLine();
		scan.nextLine();
		
		return tituloDel;
		
	}
	
	public static void cancelarDelete() {
		System.err.println("\nOperação foi cancelada pelo usuário!");
		
	}
	
	public static void sairDoPrograma() {
		
		System.out.println("\nSaindo do programa...");
		System.exit(0);
		scan.close();
		
	}

}
