package Computador;

public class Main {

	public static void main(String[] args) {
		
		try {
			PlacaMae pm = new PlacaMae("Asus", "Gamer");
			
			pm.hd.setMarca("Barracuda");
			pm.hd.setModelo("234-A");
			pm.hd.setCapacidade(1000);
			pm.hd.setRpm(7000);
			
			pm.memoria.setMarca("Segate");
			pm.memoria.setModelo("1234");
			pm.memoria.setCapacidade(8);
			pm.memoria.setVelocidade(2400);
			
			pm.processador.setMarca("Intel");
			pm.processador.setModelo("Intel i5 10g");
			pm.processador.setCache(4);
			pm.processador.setClock(5);
			
			Gabinete g = new Gabinete("Red Dragon Black", "Atx", 3, pm);
			
			Computador c = new Computador(220, 500, "Dell", "A299", g);
			
			c.mouse.setMarca("Logitech");
			c.mouse.setTipo("Com fio");
			
			c.teclado.setMarca("Red Dragon");
			c.teclado.setTipo("Mecânico");
			
			c.monitor.setMarca("AOC");
			c.monitor.setTipo("LED");
			c.monitor.setResolucao("1080x980");
			
			System.out.println(c);
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
	}

}
