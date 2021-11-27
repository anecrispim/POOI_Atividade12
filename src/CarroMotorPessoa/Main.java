package CarroMotorPessoa;

public class Main {

	public static void main(String[] args) {
		try {
			Carro c = new Carro();
			
			c.dono.setNome("Ane");
			c.dono.setEndereco("Rua Brigadeiro");
			
			c.motor.setMarca("Hyundai");
			c.motor.setPotencia(2);
			c.motor.setCilindros(4);
			c.motor.setCombustivel("Gasolina");
			
			c.setAno(2015);
			c.setFabricante("Hyundai");
			c.setModelo("i30 variant");
			c.setCor("Preto");
			
			System.out.println(c);
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
