package com.weg.biblioteca.model;

public class Livro {
	
	private String titulo;
	private String autor;
	private double preco;
	private int anoLancamento;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, double preco, int anoLancamento, boolean disponivel){
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.anoLancamento = anoLancamento;
		this.disponivel = disponivel;
	}
	
	public Livro() {
		this.titulo = "";
		this.autor = "";
		this.preco = 0.0;
		this.anoLancamento = 0;
		this.disponivel = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public boolean getDisponibilidade() {
		return disponivel;
	}
	
	public void setDisponibilidade() {
		this.disponivel = disponivel;
	}

}
