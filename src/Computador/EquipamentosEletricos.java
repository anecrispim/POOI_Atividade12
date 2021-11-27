package Computador;

public class EquipamentosEletricos {
	private float tensao;
	private float consumo;
	
	public EquipamentosEletricos(float tensao, float consumo) {
		setTensao(tensao);
		setConsumo(consumo);
	}
	public float getTensao() {
		return tensao;
	}
	public void setTensao(float tensao) {
		this.tensao = tensao;
	}
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EquipamentosEletricos [tensao=");
		builder.append(tensao);
		builder.append(", consumo=");
		builder.append(consumo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
