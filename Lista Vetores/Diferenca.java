package prjVetor;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],b[],c[],j,repeticoes, contC = 0 , i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor A: ");
            a[i] = in.nextInt();
        }

       
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º valor do vetor B: ");
            b[i] = in.nextInt();
        }

        
        for (i = 0; i < TAM; i++) {

            repeticoes = 0;

           
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    repeticoes++; 
                }
            }

       
            if (repeticoes == 0) {
                c[contC] = a[i];
                contC++;
            }
        }

        
        System.out.println("\nVetor C (Diferença A - B):");
        if (contC == 0) {
            System.out.println("Nenhum elemento de A é diferente de B.");
        } else {
            for (i = 0; i < contC; i++) {
                System.out.println(c[i]);
            }
        }
        
	}
}
