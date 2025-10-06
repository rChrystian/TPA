package prjFatorial;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i=1;
		int fat=1;
		int n;
		
		System.out.println("Digite o número desejado: ");
		n = in.nextInt();
		
		do {
			fat =  fat*i;
			i++;
			
	} while (i<=n); 
		
		System.out.println("O fatorial de "+n+" é: "+fat);
	}

}
