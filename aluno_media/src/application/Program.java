package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno: ");
		student.nome = sc.nextLine();
		
		do{
			System.out.println("Digite a nota do primeiro trimestre: ");
			student.nota1 = sc.nextDouble();
		}while (student.nota1 < 0 && student.nota2 >30);
		
		do{
			System.out.println("Digite a nota do segundo trimestre: ");
			student.nota2 = sc.nextDouble();
		}while (student.nota2 < 0 && student.nota2 >35);
		
		
		do{
			System.out.println("Digite a nota do terceiro trimestre: ");
			student.nota3 = sc.nextDouble();
		}while (student.nota3 < 0 && student.nota3 > 35);
		
		System.out.println("A media do aluno é: " + student.mediaAluno());
		
		if (student.media > 60) {
			System.out.println("PASS");
		}else{
			System.out.println("FAILED");
			System.out.println("MISSING " + student.passouAluno() + " POINTS");
		}
		
		sc.close();
	}
}
