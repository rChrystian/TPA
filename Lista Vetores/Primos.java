package prjVetor;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=10;
		int a[], num,divisores,m,i;
		a = new int[TAM];
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
        for ( i = 0; i < TAM; i++) {
            num = a[i];
            divisores = 0;

            
            for (m = 1; m <= num; m++) {
                if (num % m == 0) {
                    divisores++;
                }
            }
        
        
            if (divisores == 2) {
                System.out.println(num + " é primo");
                System.out.println();
            } else {
                System.out.println(num + " não é primo");
                System.out.println();
            }    
        }
	}
}