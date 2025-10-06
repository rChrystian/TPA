package prjIdadeAlturaPeso;

import java.util.Scanner;

public class IdadeAlturaPeso {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int maior50 = 0;
        double somaAlturas = 0;
        int idade10a20 = 0;
        int pesoMenor40 = 0;
        int idade,altura,peso;
        double mediaAlturas,porcPesoMenor40;
        int maisVelho = 0;
        int maisNovo = 0;
		
		for (int i=1;i<26;i++) {
			System.out.println("Pessoa " + i + ":");
			
			System.out.println("Digite a idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite a altura: ");
			altura = ler.nextInt();
			
			System.out.println("Digite o peso: ");
			peso = ler.nextInt();
			
			if (idade>50){
				maior50++;
			}
			
			if (idade>=10&&idade<=20) {
				somaAlturas+=altura;
				idade10a20++;
			}
			
			if (peso<40) {
				pesoMenor40++;
			}
			
			if (idade > maisVelho) {
				maisVelho = idade;
	        }
			
	        if (idade < maisNovo) {
	           maisNovo = idade;
	        }				
	        
	        System.out.println();
		}
		
		if (idade10a20 > 0) {
	       mediaAlturas = somaAlturas / idade10a20;
	    } else {
	       mediaAlturas = 0;
	    }
		
		porcPesoMenor40 = (pesoMenor40 * 100) / 25;

	    System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + maior50);
	    System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturas);
	    System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcPesoMenor40 + "%");
	    System.out.println("Idade da pessoa mais velha: " + maisVelho);
	    System.out.println("Idade da pessoa mais nova: " + maisNovo);
	}

}