import java.util.Scanner;

public class Agenda {
	
	private Pessoa[] pessoa;
	private int quantideamigo;
	private int quantidadeconhecido;

	public Agenda(int quantidade){
		
		this.quantidadeconhecido = 0;
		this.quantideamigo = 0;
		
		this.pessoa = new Pessoa[quantidade];
		for (int i=0; i<quantidade; i++){
			int j = 1 + (int) (Math.random() * 2);
			if (j==1){
				
				this.pessoa[i] = new Amigo();
				this.addinfo(i, 1);
				this.quantideamigo += this.quantideamigo + 1;
				
			}else if(j==2){
				
				this.pessoa[i] =  new Conhecido();
				this.addinfo(i, 2);
				this.quantidadeconhecido += this.quantidadeconhecido + 1;
			}
		}
	}
	
	public void mostrarniver(){
		for(int i=0; i<this.pessoa.length; i++){
			if(this.pessoa[i] instanceof Amigo){
				System.out.println(((Amigo)pessoa[i]).getData());
				System.out.println(((Amigo)pessoa[i]).getIdade());
				System.out.println(((Amigo)pessoa[i]).getNome());
			}
		}
	}

	public void email(){
		for(int i=0; i<this.pessoa.length; i++){
			if (this.pessoa[i] instanceof Conhecido){
				System.out.print(((Conhecido)pessoa[i]).getEmail());
				System.out.print(((Conhecido)pessoa[i]).getIdade());
				System.out.print(((Conhecido)pessoa[i]).getNome());
			}
		}	
	}	
	
	private void addinfo(int i, int j){
		Scanner x = new Scanner(System.in);
		
		if(j==1){
			
			System.out.print("Digite a data de aniversário: ");
			String data = x.nextLine();
			((Amigo)pessoa[i]).setData(data);
			System.out.print("Digite o nome: ");
			data = x.nextLine();
			((Amigo)pessoa[i]).setNome(data);;
			System.out.print("Digite a idade: ");
			int idade = x.nextInt();
			((Amigo)pessoa[i]).setIdade(idade);
			
		}else if(j==2){
			
			System.out.print("Digite o email: ");
			String data = x.nextLine();
			((Conhecido)pessoa[i]).setEmail(data);
			System.out.print("Digite o nome: ");
			data = x.nextLine();
			((Conhecido)pessoa[i]).setNome(data);;
			System.out.print("Digite a idade: ");
			int idade = x.nextInt();
			((Conhecido)pessoa[i]).setIdade(idade);
			
		}
	}
		
	public int getQuantideamigo() {
		return quantideamigo;
	}
	
	public void setQuantideamigo(int quantideamigo) {
		this.quantideamigo = quantideamigo;
	}
	
	public Pessoa[] getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa[] pessoa) {
		this.pessoa = pessoa;
	}
	
	public int getQuantidadeconhecido() {
		return quantidadeconhecido;
	}
	
	public void setQuantidadeconhecido(int quantidadeconhecido) {
		this.quantidadeconhecido = quantidadeconhecido;
	}
}
