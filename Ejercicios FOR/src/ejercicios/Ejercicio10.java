package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numA, numB;
		
		System.out.println("Introduzca un numero");
		numA = sc.nextInt();
		System.out.println("Introduzca un numero mayor que el anterior");
		numB = sc.nextInt();
		
		System.out.println("Estos son los numeros entre "+numA+" y "+numB);
		for(int i=numA+1;i<numB;i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
