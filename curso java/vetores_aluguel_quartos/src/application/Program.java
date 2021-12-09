package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Pessoa[] vect = new Pessoa[10];
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println();
			System.out.print("RENT #" + i +": ");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Pessoa(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for ( int i=0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}

		

		sc.close();
	}
}
