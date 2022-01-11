package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;
import entities.EmpregadoTerceirizado;


public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Terceirizado (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new EmpregadoTerceirizado(name, hours, valuePerHour, additionalCharge));
			}else {
				list.add(new Empregado(name, hours, valuePerHour));
			}
		}
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for ( Empregado emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		sc.nextInt();
		
		sc.close();
	}
}
