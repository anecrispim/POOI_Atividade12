package HomeTheater;

public class Main {

	public static void main(String[] args) {
		try {
			HomeTheater ht = new HomeTheater();

			ht.som.setTensao(110);
			ht.som.setPotencia(2000);
			ht.som.setModelo("AA5");
			ht.som.setMarca("LG");
			ht.som.setConsumo(600);
			
			ht.video.setTensao(220);
			ht.video.setTipo("LCD");
			ht.video.setResolucao("140");
			ht.video.setModelo("L600");
			ht.video.setMarca("AOC");
			ht.video.setConsumo(400);
			
			System.out.println(ht);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}