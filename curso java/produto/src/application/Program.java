package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		System.out.println("Poduct data: " + product);
		
		System.out.print("Enter the number of products to be added in sotck: ");
		int value = sc.nextInt();
		product.AddProducts(value);
		
		System.out.println("Updated data: " + product);
		System.out.print("Enter the number of products to be removed from stock: ");
		int value1 = sc.nextInt();
		product.RemoveProducts(value1);
		
		System.out.println("Updated data: " + product);
		
		sc.close();
	}
}
