package prjDezTabuadas;

public class Tabuadas {

	public static void main(String[] args) {

		int i, r, n;
		
		for (i=1; i<=10; i++) {
			 System.out.println("Tabuada do "+i);
			 
			 for(n=1; n<=10; n++) {
				 r = i*n;
				 System.out.println(i+"x"+n+"="+r);
			 }
		}
		
	}

}