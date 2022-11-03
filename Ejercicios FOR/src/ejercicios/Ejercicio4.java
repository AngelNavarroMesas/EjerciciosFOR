package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduzca un numero y mostrare los multiplos de 3 hasta ese numero");
		num = sc.nextInt();
		
		for(int i=1; (i*3)<=num; i++) {
			System.out.println(i*3);
		}
		
		sc.close();
	}

}
