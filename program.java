import java.util.Scanner;

import entities.Product;

public class program {

	public static void main(String[] args) {
		Scanner reading = new Scanner(System.in);
		
		System.out.println("Name: ");
		String nome = reading.next().toUpperCase();
		
		System.out.println("Preço: ");
		double price = reading.nextDouble();
		
		Product Produto1 = new Product(nome, price);
		
		System.out.println(Produto1);
		
		
		
		System.out.println("Enter the number of products to be added in stock: ");
		Produto1.addProduto(reading.nextInt());
		
		System.out.println(Produto1); 
		/*System.out.println("Updated data: "+ p1);
		System.out.println("Enter the number of products to be removed from stock: ");
		p1.retirarProduto(reading.nextInt());
		System.out.println("Updated data: "+ p1);		*/
		

	}

}
