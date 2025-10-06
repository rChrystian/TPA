package prjAltura;

public class Altura {

	public static void main(String[] args) {
		double p=145;
		double j=134;
		double i=0;
		System.out.println("Pedro = 145cm");
		System.out.println("João = 134cm");
		
		do {
			p = p+2;
			j = j+2.5;
			i++;
		} while (j<=p);
		
		System.out.println("Será necessário "+i+" anos para João ficar maior que Pedro.");
		System.out.println("Pedro = "+p+"cm");
		System.out.println("João = "+j+"cm");
	}

}