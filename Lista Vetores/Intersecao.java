package prjVetor;

import java.util.Scanner;

public class Intersecao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[],b[],c[],j,k,contC = 0,repeticoes,i;
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
            for (j = 0; j < TAM; j++) {

                if (a[i] == b[j]) {

                    repeticoes = 0;

                    
                    for (k = 0; k < contC; k++) {
                        if (c[k] == a[i]) {
                            repeticoes++;
                        }
                    }

                    
                    if (repeticoes == 0) {
                        c[contC] = a[i];
                        contC++;
                    }
                }
            }
        }

        
        System.out.println("\nVetor C (Interseção):");
        if (contC == 0) {
            System.out.println("Não há elementos em comum.");
        } else {
            for (i = 0; i < contC; i++) {
                System.out.println(c[i]);
            }
        }
		
	}
}
