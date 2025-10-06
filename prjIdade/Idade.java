package prjIdade;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int n, total;
		int faixa1=0, faixa2=0, faixa3=0, faixa4=0, faixa5=0;
		int i = 0;
		
		do {
			System.out.println("Digite sua idade");
			n = ler.nextInt();
			
			if (n<=15) {
				faixa1++;
			} else if (n<=30) {
				faixa2++;
			} else if (n<=45) {
				faixa3++;
			} else if (n<=60) {
				faixa4++;
			} else if (n>=61) {
				faixa5++;
			}
			
			System.out.println("Deseja continuar? 1-Sim 2-Não");
			i = ler.nextInt();
					
		} while (i==1);
			
		System.out.println("1ª Faixa: "+faixa1+" pessoas");
		System.out.println("2ª Faixa: "+faixa2+" pessoas");
		System.out.println("3ª Faixa: "+faixa3+" pessoas");
		System.out.println("4ª Faixa: "+faixa4+" pessoas");
		System.out.println("5ª Faixa: "+faixa5+" pessoas");
		
		total = faixa1+faixa2+faixa3+faixa4+faixa5;
		
		faixa1 = (faixa1*100)/total;
		faixa2 = (faixa2*100)/total;
		faixa3 = (faixa3*100)/total;
		faixa4 = (faixa4*100)/total;
		faixa5 = (faixa5*100)/total;
		
		System.out.println("Porcentagens:");
		System.out.println("1ª Faixa: "+faixa1+"%");
		System.out.println("2ª Faixa: "+faixa2+"%");
		System.out.println("3ª Faixa: "+faixa3+"%");
		System.out.println("4ª Faixa: "+faixa4+"%");
		System.out.println("5ª Faixa: "+faixa5+"%");
	}

}
