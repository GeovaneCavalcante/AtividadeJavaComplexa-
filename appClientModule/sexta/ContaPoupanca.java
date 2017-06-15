package sexta;

public class ContaPoupanca extends ContaBancaria {
	
	private float taxarendimento;
	
	public ContaPoupanca(String senha, float saldo, int numero) {
		
		super(senha);
		this.setNumero(numero);
		this.setSaldo(saldo);	
	}
	
	public void taxaderendimento(){
		System.out.println("Taxa de rendimento ao ano: " + this.getSaldo() * (1 + 0.10));
	}
	
	@Override
	public void sacar(float sacar) {
		
		if(sacar<=this.getSaldo()){
			
			this.setSaldo(this.getSaldo()-sacar);
			
		}else{
			
			System.out.println("Você não tem esse valor! ");
		}
		
	}

	@Override
	public void depositar(float deposito) {
		
		if(deposito>0){
			
			this.setSaldo(this.getSaldo()+deposito);
			
		}else{
			
			System.out.println("Você não pode depositar essa quantia! ");
		}
		
	}

	@Override
	public void tirarExtrato() {
		
		System.out.println("Numero da conta: "+ this.getNumero() + "\nSaldo: " + this.getSaldo());
		
	}

	@Override
	public void alterarSenha(String nova) {
		
		if(this.getSenha().equals(nova)){
			
			this.setSenha(nova);
			System.out.println("Senha alterada: nova:" + this.getSenha());
			
		}else{
			
			System.out.println("Senha incorreta! ");
		}	
	}

	public float getTaxarendimento() {
		return taxarendimento;
	}

	public void setTaxarendimento(double d) {
		this.taxarendimento = (float) d;
	}
	
}
