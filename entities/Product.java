package entities;

import java.util.Scanner;

public class Product {
	private double price;
	private int quantidade;
	private String nome;
	Scanner reading = new Scanner(System.in);

	public Product() {
		
	}

	public Product( String nome, double price) {
		
		this.price = price;
		this.nome = nome;
	}

	public Product(double price, int quantidade, String nome) {
		
		this.price = price;
		this.quantidade = quantidade;
		this.nome = nome;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantidade() {
		return quantidade;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double valorTotalEmEstoque() {
		return price * quantidade;
	}

	public void addProduto(int add) {
		quantidade += add;
	}

	public void retirarProduto(int menos) {
		quantidade -= menos;
	}

	public String toString() {
		return "|Produto " + nome + "|Quantidade: " + quantidade + "|Preço: " + String.format("%.2f", price)
				+ " |Valor em estoque " + String.format("%.2f", valorTotalEmEstoque());

	}

}
