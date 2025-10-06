package prjFibonacci;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1;
		int a=1;
		int b=1;
		int n, pro;
		
		System.out.println("Digite o número de termos");
		n=ler.nextInt();
		System.out.println(a+b);
		do {
			pro=a+b;
			System.out.println(pro);
			a=b;
			b=pro;
			i++;
			
		}while(i<n);
   
	}

}
