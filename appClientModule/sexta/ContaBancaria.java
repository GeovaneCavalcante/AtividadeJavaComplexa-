package sexta;

public abstract class ContaBancaria {
	
	private String senha;
	private int numero;
	private float saldo;
	
	public ContaBancaria(String senha){
		this.senha = senha;
	}
	
	public abstract void sacar(float sacar);
	
	public abstract void depositar(float deposito);
	
	public abstract void tirarExtrato();
	
	public abstract void alterarSenha(String nova);
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
}
