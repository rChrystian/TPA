package lista2;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a;
		int i, cont = 0;
		a = new int[10];
		
		for (i=0; i<10; i++) {
			System.out.println("Digite o "+(i+1)+" valor: ");
			a[i] = in.nextInt();
		}
	
		for(i=0; i<10; i++) {
			for (int d = 2; d*d <=a[i]; d++) {
				if (a[i] % d==0) {
					cont++;					
				}
			}
				
			if (cont>0) {
				System.out.println(a[i]+" não é primo.");
			} else {
				System.out.println(a[i]+" é primo.");			}
		}		
	}
}
