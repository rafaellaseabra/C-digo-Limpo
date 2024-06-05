package CodigoLimpo;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor;
		//entrada
        System.out.print("Informe um valor: ");
        valor = ler.nextDouble();
        
        if (valor % 5==0) {
        	System.out.println ("O número " + valor + " é multiplo de 5");
        }
        if (valor%5 !=0){
        	System.out.println("O número  " + valor + " não é multiplo de 5");
        }
        ler.close();

	}

}
