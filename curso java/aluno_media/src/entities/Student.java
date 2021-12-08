package entities;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public double mediaAluno() {
		media = nota1 + nota2 + nota3;
		return media;
	}
	public double passouAluno() {
		double passou = 60 - media;
		return passou;
	}
}
