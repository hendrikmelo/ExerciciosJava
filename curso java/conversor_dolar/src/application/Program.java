package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Cotacao;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cotacao cotacao = new Cotacao();
		
		System.out.println("What is the dollar price? ");
		cotacao.cotacao = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		cotacao.valor = sc.nextDouble();
		
		System.out.println("Amount to be paid in reais = " + cotacao.valorReal());
		
		sc.close();
	}
}
