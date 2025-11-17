package prjVetor;

import java.util.Scanner;

public class RotinaBusca {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],x,encontrado = 0,i;
		a = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
            a[i] = in.nextInt();
        }

        
        System.out.print("\nDigite o valor X para buscar no vetor: ");
        x = in.nextInt();

      
        for (i = 0; i < TAM; i++) {
            if (a[i] == x) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado++; 
            }
        }

      
        if (encontrado == 0) {
            System.out.println("Valor não encontrado no vetor.");
        }
		
	}
}
