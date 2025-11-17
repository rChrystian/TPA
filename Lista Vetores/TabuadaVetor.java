package prjVetor;

import java.util.Scanner;

public class TabuadaVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		final int TAM=5;
		int a[] , multiplicador, i;
		a = new int [TAM];
		
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            a[i] = in.nextInt();
        }

        
        for (i = 0; i < TAM; i++) {
            System.out.println("\nTabuada de " + a[i] + ":");
            
            for (multiplicador= 1; multiplicador <= 10; multiplicador++) {
                System.out.println(a[i] + " x " + multiplicador + " = " + (a[i] * multiplicador));
            }
        }
	}
}