package ContaAvancada;

public class Main {

	public static void main(String[] args) {
		try {
			ContaBancaria c = new ContaBancaria(200, 10000);
			
			c.correntista.setNome("Paulo");
			c.correntista.setEndereco("Rua Brigadeiro");
			
			c.banco.setCodigo(1);
			c.banco.setNome("Banco do Brasil");
			c.banco.setNumeroAgencias(200);
			
			c.deposito(1000);
			c.saque(100);
			
			System.out.println(c);
			
			ContaEspecial ce = new ContaEspecial(201, 2000, 10, 500);
			
			ce.correntista.setNome("Carlos");
			ce.correntista.setEndereco("Rua Marco");
			
			ce.banco.setCodigo(2);
			ce.banco.setNome("Caixa");
			ce.banco.setNumeroAgencias(201);
			
			ce.deposito(200);
			ce.saque(500);
			
			ce.cartao.setNumero(9999999);
			ce.cartao.setOperadora("Mastercard");
			ce.cartao.setLimite(300);
			ce.cartao.setTipoDeCartao("crédito");
			
			System.out.println(ce);
			
			ContaSimples cs = new ContaSimples(202, 1000, 3000);
			
			ce.correntista.setNome("Jeovaldo");
			cs.correntista.setEndereco("Rua Xuxu");
			
			cs.banco.setCodigo(3);
			cs.banco.setNome("Bradesco");
			cs.banco.setNumeroAgencias(202);
			
			cs.depositoPoupanca(500);
			cs.saquePoupanca(300);
			
			System.out.println(cs);
			
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
