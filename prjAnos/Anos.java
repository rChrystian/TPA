package prjAnos;

import java.util.Scanner;

public class Anos {

	public static void main(String[] args) {
		
		Scanner ler =  new Scanner(System.in);
		
		int anoInicial, anoFinal, qtdAnos = 0, i;
		
		System.out.println("Digite o ano inicial: ");
		anoInicial =  ler.nextInt();
		
		System.out.println("Digite o ano final: ");
		anoFinal = ler.nextInt();
		
		i = anoInicial;
		
		System.out.println("Anos bissextos: ");
		
		while (i<=anoFinal) {
			if (i%4==0) {
				int bissexto = i;
				System.out.println(bissexto);
				qtdAnos++;
			}
			i++;
		}
		
		System.out.print("Quantidade de anos bissextos: "+qtdAnos);
		
	}

}
