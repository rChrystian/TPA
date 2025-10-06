package prjSomaCinco;

public class Soma {

	public static void main(String[] args) {
		
		int r = 0;
		
		for (int i = 0; i<=400; i++) {
			if (i%5==0 | i%5==5) {
				r += i;
			}
				
		}
			
		System.out.println("Valor final da somatória: "+r);

	}
}
