package Computador;

public class Memoria {
	private String marca;
	private String modelo;
	private float capacidade;
	private int velocidade;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(float capacidade) {
		this.capacidade = capacidade;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memoria [marca=");
		builder.append(marca);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append(", velocidade=");
		builder.append(velocidade);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
}
