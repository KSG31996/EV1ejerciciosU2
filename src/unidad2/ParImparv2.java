package unidad2;

import java.util.Scanner;

public class ParImparv2 {

	public static void main(String[] args) {
		/* En el m�todo main de una clase llamada ParImpar escribe un programa que
		 * diga si un n�mero introducido por teclado es par o impar.
		*/
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un n�mero y te dir� si es par o impar: ");
		int r = teclado.nextInt();
		
		if (r % 2 == 0)
		{
			System.out.printf("El n�mero %d es par", r);
		}
		else
		{
			System.out.printf("El n�mero %d es impar", r);
		}

	}

	}

}
