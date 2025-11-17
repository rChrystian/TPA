package prjVetor;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=7;
		int a[],num,m,i;
		long b[],fatorial;
		a = new int [TAM];
		b = new long [TAM];
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
		for (i = 0; i < TAM; i++) {
            num = a[i];
            fatorial = 1;

            for (m= 1; m <= num; m++) {
                fatorial *= m;
            }

            b[i] = fatorial;
        }

        
        for (i = 0; i < TAM; i++) {
            System.out.println("A = " + a[i] + "  Fatorial = " + b[i]);
        }
		
		
		
	}
}
