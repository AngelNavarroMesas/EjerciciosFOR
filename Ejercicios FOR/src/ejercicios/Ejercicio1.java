package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un numero para aprender a contar");
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
