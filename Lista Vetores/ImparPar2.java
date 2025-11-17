package prjVetor;

import java.util.Scanner;

public class ImparPar2 {

	public static void main(String[] args) {
Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],b[],i;
		a = new int [TAM];
		b = new int [TAM];
		
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
            a[i] = in.nextInt();
        }

        
        for (int i1 = 0; i1 < TAM; i1++) {

            if (a[i1] % 2 == 0) {  
            	
                b[i1] = 1;
                
            } else {             
                b[i1] = 0;
            }
        }

        
        System.out.println("\nVetor B:");
        for (i = 0; i < TAM; i++) {
            System.out.println("B = " + b[i]);
        }
	}
}
