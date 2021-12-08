package entities;

public class Cotacao {
	
	public double cotacao;
	public double valor;
	
	public double valorReal() {
		valor = valor * cotacao * 1.06;		
		return valor;		
	}
}
