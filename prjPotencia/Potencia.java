package prjPotencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int base, expoente;
        long potencia = 1; 

        System.out.print("Digite a base: ");
        base = in.nextInt();

        System.out.print("Digite o expoente: ");
        expoente = in.nextInt();

        if (expoente == 0) {
            potencia = 1; 
        } else {
            int i = 0;
            
            do {
                potencia = potencia * base;   
                i++;          
            } while (i < expoente); 
 
        }
        
        System.out.println(base + " ^ " + expoente + " = " + potencia);

    }
}
