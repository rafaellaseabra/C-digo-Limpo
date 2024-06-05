package CodigoLimpo;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int sMestre,sTentativa;
		double num1,num2,soma;
		
		System.out.print("Cadastre uma senha (APENAS NÚMEROS!): ");
		sMestre = ler.nextInt();
		
		System.out.print("Digite um número: ");
		num1 = ler.nextDouble();
		System.out.print("Digite mais um número: ");
		num2 = ler.nextDouble();
		soma = num1+num2;
		
		System.out.print("Digite a sua senha para desbloquear a soma: ");
	    sTentativa = ler.nextInt();
	    
	    if (sTentativa == sMestre) {
	    	System.out.println ("O resultado da soma é: " +soma);
	    }
	    
	    if(sTentativa != sMestre) {
	    	System.out.println("ERRO! SENHA ERRADA!");
	    }
	ler.close();
	}

}
