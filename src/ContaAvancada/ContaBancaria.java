package ContaAvancada;

public class ContaBancaria {
	protected Banco banco;
	private int agencia;
	private double saldo;
	protected Pessoa correntista;
	
	public ContaBancaria(int agencia, double saldo) {
		this.banco = new Banco();
		this.correntista = new Pessoa();
		setAgencia(agencia);
		setSaldo(saldo);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getCorrentista() {
		return correntista;
	}

	public void setCorrentista(Pessoa correntista) {
		this.correntista = correntista;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			setSaldo(getSaldo() + valor);
			return true;
		}
		return false;
	}
	
	public boolean saque(double valor) {
		if (valor <= getSaldo() && valor > 0) {
			setSaldo(getSaldo() - valor);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaBancaria [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", correntista=");
		builder.append(correntista);
		builder.append("]");
		return builder.toString();
	}
}
