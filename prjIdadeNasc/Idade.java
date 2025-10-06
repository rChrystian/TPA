package prjIdadeNasc;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int anoNasc, idade, i = 0, anoAtual = 2025;
		
		do {
			System.out.println("Digite o ano de nascimento: ");
			anoNasc = ler.nextInt();
			
			idade = anoAtual - anoNasc;
			System.out.println("Idade: "+idade);
			
			System.out.println("Deseja continuar? Digite: 1- Sim 0- Não");
			i = ler.nextInt();
		}while (i==1);	
	}

}
