package lista2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		
		final int TAM = 20;
		int a[], b[], proximaPosicaoB = 0, i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor: ");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
	         if (a[i] % 2 == 0) {
	             b[proximaPosicaoB] = a[i];
	             proximaPosicaoB++;
	         }
	     }
		 
		 for (i = 0; i < TAM; i++) {
	         if (a[i] % 2 != 0) {
	             b[proximaPosicaoB] = a[i];
	             proximaPosicaoB++;
	         }
	     }
		 
		 System.out.println("\nPares:");
	     for (i = 0; i < TAM; i++) {
	         if (b[i] % 2 == 0) {
	             System.out.print(b[i] + ", ");
	         }
	     }
	
	     
	     System.out.println("\n\nÍmpares:");
	     for ( i = 0; i < TAM; i++) {
	         if (b[i] % 2 != 0) {
	             System.out.print(b[i] + ", ");
	         }
	     }
	}

}
