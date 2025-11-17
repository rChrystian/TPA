package prjVetor;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);	
		
		
		final int TAM=20;
		int a[],b[],proxPosicao,i;
		int[] num;
		a = new int [TAM];
		b = new int [TAM];
		
		
		for(i=0;i <TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor  A:");
			a[i] = in.nextInt();
			
		}
		
		proxPosicao = 0;
		
		 for (i = 0; i < TAM; i++) {
	         if (a[i] % 2 == 0) {
	             b[proxPosicao] = a[i];
	             proxPosicao++;
	         }
	     }
		 
		 for (i = 0; i < TAM; i++) {
	         if (a[i] % 2 != 0) {
	             b[proxPosicao] = a[i];
	             proxPosicao++;
	         }
	     }
		 
		 System.out.println("\nPares:");
	     for (i = 0; i < TAM; i++) {
	         if (b[i] % 2 == 0) {
	             System.out.print(b[i] + " ");
	         }
	     }
	
	     
	     System.out.println("\n\nÍmpares:");
	     for ( i = 0; i < TAM; i++) {
	         if (b[i] % 2 != 0) {
	             System.out.print(b[i] + " ");
	         }
	     }
		 
	 
	}
}
