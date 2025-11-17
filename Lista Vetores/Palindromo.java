package prjVetor;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],erros = 0,j,i;
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
            a[i] = in.nextInt();
        }

        
        for (i = 0; i < TAM/2; i++) {
            j = TAM - 1 - i; 

            if (a[i] != a[j]) {
                erros++; 
            }
        }

        
        if (erros == 0) {
            System.out.println("\nO vetor É um palíndromo.");
        } else {
            System.out.println("\nO vetor NÃO é um palíndromo.");
        }
        
	}
}
