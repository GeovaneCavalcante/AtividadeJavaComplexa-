import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int i=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("digite quantas pessoas quer colocar: ");
		i =  ler.nextInt();
		
		Agenda x = new Agenda(i);
		
		System.out.println("Amigos: "+ x.getQuantideamigo() + "\nConhecidos: "+ x.getQuantidadeconhecido());
		x.mostrarniver();
		x.email();
		
	}

	
}