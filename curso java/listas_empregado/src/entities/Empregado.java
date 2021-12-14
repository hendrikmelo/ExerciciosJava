package entities;

public class Empregado {
	private Integer id;
	private String name;
	private Double salario;
	
	public Empregado() {
	
	}
	
	public Empregado(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Empregado(Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalario() {
		return salario;
	}	
	
	public void aumentoSalario(double percentage) {
		salario *= 1 + percentage/100;
	}
	
	@Override
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}
}
