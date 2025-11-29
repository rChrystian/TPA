package lista2;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] a;
		int i,tabuada;
		a = new int[5];
		
		for (i=0; i<5; i++) {
			System.out.println("Digite o "+(i+1)+" número: ");
			a[i] = in.nextInt();
		}
		
		System.out.println("\nTabuadas: ");
		
		for (i=0; i<5; i++) {
			System.out.println("\n"+(i+1)+"º Tabuada: ");
			
			for (tabuada = 1; tabuada<=10; tabuada++) {
				System.out.println(+a[i]+" x "+tabuada+" = "+(a[i]*tabuada));
			}
			
		}
		
		

	}

}
