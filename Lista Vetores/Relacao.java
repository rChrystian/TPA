package prjVetor;

import java.util.Scanner;

public class Relacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int TAM=10;
		int a[],num,m,i;
		a = new int [TAM];
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
		for (i = 0; i < TAM; i++) {
            num = a[i];

            System.out.println("Número: " + num);
            System.out.print("Pares de 0 até " + num + ": ");

            for (m = 0; m <= num; m++) {
                if (m % 2 == 0) {
                    System.out.print(m + " ");
                }
            }

            System.out.println("\n");
        }
		
		
	}
}
