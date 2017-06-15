package sexta;

public class ContaCorrente extends ContaBancaria{
	
	private int qtdtran;
	
	public ContaCorrente(String senha, double d, int numero) {
		
		super(senha);
		this.setNumero(numero);
		this.setSaldo((float)d);
		this.setQtdtran(0);
	}
	
	@Override
	public void sacar(float sacar) {
		
		if(sacar<=this.getSaldo()){
			
			this.setSaldo(this.getSaldo()-sacar);
			this.setQtdtran(this.getQtdtran()+1);
			
		}else{
			
			System.out.println("Você não contem esse saldo para realizar tranzição: ");
			
		}
		
	}

	@Override
	public void depositar(float deposito) {
		
		if(deposito>0){
			
			this.setSaldo(this.getSaldo()+deposito);
			this.setQtdtran(this.getQtdtran()+1);
			
		}else{
			
			System.out.println("Não é possivel depositar esse valor! ");
			
		}
		
	}

	@Override
	public void tirarExtrato() {
		
		System.out.println("Numero da conta: "+ this.getNumero() + "\nSaldo: " + this.getSaldo());
		
	}

	@Override
	public void alterarSenha(String nova) {
		
		if(nova == this.getSenha()){
			this.setSenha(nova);
		}else{
			System.out.println("Senha incorreta");
		}	
	}

	public int getQtdtran() {
		return qtdtran;
	}

	public void setQtdtran(int qtdtran) {
		this.qtdtran = qtdtran;
	}
	
}
