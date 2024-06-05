package CodigoLimpo;

import java.util.Scanner;

public class JuntaVetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor1[] = new int[2];
		int valor2[] = new int[2];
		int a[] = new int[4];
		int i;
		for (i=0; i<2; i++) {
			System.out.println("Informe o " + i + "° valor: ");
			valor1[i] = ler.nextInt();
			System.out.println("Informe o " + i + " ° valor: ");
			valor2[i] = ler.nextInt();
		}

		//juntar vetores
		for (i=0; i<2; i++) {
			a[i]=valor1[i];
			a[i+2]=valor2[i];
		}
		for (i=0; i<4; i++) {
			System.out.println("Os valores nas seguintes posições "+ i + " -- são: " +a[i]);
		}
		ler.close();
	}

}
