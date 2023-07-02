import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		//classe que é responsavel pelo gerenciamento de produtos em estoque
		
		Scanner reading = new Scanner(System.in);
		
		System.out.println("Name: ");
		String nome = reading.next().toUpperCase();
		
		System.out.println("Preço: ");
		double price = reading.nextDouble();
		
		Product produto1 = new Product(nome, price);
		
		System.out.println(produto1);
		
		
		
		System.out.println("Enter the number of products to be added in stock: ");
		produto1.addProduto(reading.nextInt());
		
		System.out.println(produto1); 
		System.out.println("Updated data: "+ produto1);
		System.out.println("Enter the number of products to be removed from stock: ");
		produto1.retirarProduto(reading.nextInt());
		System.out.println("Updated data: "+ produto1);		
		

	}

}
