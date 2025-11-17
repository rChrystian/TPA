package prjVetor;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=11;
		int a[],i;
		a = new int [TAM];
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
		for (i = 0; i < TAM; i++) {
            a[i] = (int) Math.pow(2, i);
        }

        // Exibir o vetor
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
        
	}
}
