package sexta;
import java.util.Scanner;

public class Main {
	static ContaBancaria[] conta;
	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {

		criação();
		transacoe();
	}	
	
	public static void criação(){
		
		int num, numero;
		String senha;
		float valor;
		
		System.out.print("Digite quantas contas deseja criar: ");
		num = ler.nextInt();
		conta = new ContaBancaria[num];
		
		for (int x=0; x<conta.length; x++){
			
			System.out.print("Digite 1 para conta Poupança: \nDigite 2 para conta Corrente: ");
			num = ler.nextInt();
			
			if(num==1){
	
				System.out.print("Digite o numero para criação da conta: ");
				numero = ler.nextInt();
				System.out.print("Digite a senha para criação da conta: ");
				String te  = ler.next();
				System.out.print("Digite o valor inicial de criação da conta: ");
				valor = ler.nextFloat();
				conta[x] = new ContaPoupanca(te, valor, numero);		
				
				
			}else if(num==2){
				
				System.out.print("Digite o numero para criação da conta: ");
				numero = ler.nextInt();
				System.out.print("Digite a senha para criação da conta: ");
				senha = ler.next();
				System.out.print("Digite o valor inicial de criação da conta: ");
				valor = ler.nextFloat();
				conta[x] = new ContaCorrente(senha, valor, numero);	
				
			}
		}	
	}
	
	public static void transacoe(){
		
		int laco= 0, valor, numero=0, posicao=-9;
		String senha;
		
		System.out.print("Digite o numero da conta para realizar tranzações: ");
		numero = ler.nextInt();		
		
		for(int i=0; i<conta.length; i++){
			System.out.println(conta[i].getNumero());
			if(conta[i].getNumero() == numero){
				posicao = i;
			}
		}
		
		if(posicao!=-9){
		
			do{
				System.out.println("\n\n\n");
				System.out.println("Digite 1 para ver saldo: ");
				System.out.println("Digite 2 para sacar: ");
				System.out.println("Digite 3 para depositar: ");
				System.out.println("Digite 4 para tirar extrato: ");
				System.out.println("Digite 5 para alterar senha: ");
				if (conta[posicao] instanceof ContaPoupanca){
					System.out.println("Digite 6 para taxa de rendimento: ");
				}else{
					System.out.println("Digite 6 para quantidade de tranzações: ");
				}
				System.out.println("Digite 7 para sair do menu: ");
				valor = ler.nextInt();
				
				if(valor>0 || valor<10){
					
					switch(valor){
					case 1:
						
						System.out.println("Seu saldo é: "+conta[posicao].getSaldo());
						break;
						
					case 2:
						
						System.out.print("Digite quanto deseja sacar: ");
						float sacar = ler.nextFloat();
						conta[posicao].sacar(sacar);
						break;
						
					case 3:
						
						System.out.print("Digite quanto deseja depositar: ");
						float depositar = ler.nextFloat();
						conta[posicao].depositar(depositar);
						break;
					
					case 4:
						conta[posicao].tirarExtrato();
						break;
					
					case 5:
						System.out.println(conta[posicao].getSenha());
						System.out.print("Digite a sua antiga senha: ");
						senha = ler.next();
				
						conta[posicao].alterarSenha(senha);
						break;
						
					case 6:
						if (conta[posicao] instanceof ContaPoupanca){
							
							((ContaPoupanca)conta[posicao]).taxaderendimento();
							
						}else{
							
							System.out.println("Você fez: " + ((ContaCorrente)conta[posicao]).getQtdtran() + " Tranzações");
						}
						break;
					case 9:	
						laco=9;
						break;
					}
				}else{
					System.out.println("Inválido opção ");
				}
			}while(laco==0);
			
		}else{
			System.out.println("Conta inexistente! ");
		}	
	}
}