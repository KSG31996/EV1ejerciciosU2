package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cronometro {

	public static void main(String[] args) throws IOException {
		String nombre;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("¿Como te llamas? : ");
		long t0 = System.currentTimeMillis();
		nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		double segundos = (t1 - t0) / 1000d;
		System.out.printf("Hola %s, has tardado %.3f segundos en escribir tu nombre.\n", nombre, segundos);

	}

}
