package prjSomaVetor;
import java.util.Scanner;
public class Soma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//laço para leitura do valor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = in.nextInt();
		}// fim do laço A
		
		//laço para leitura do valor B
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor B");
			b[i] = in.nextInt();
			c[i] = a[i] + b[i];
		}// fim do laço B
		
		//Apresentação do vetor C
		System.out.println("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.println(c[i]+ " ");
			}
				
	}

}
