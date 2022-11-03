package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int num, factorial=1;
		
		System.out.println("Introduzca un numero para calcular su factorial");
		num = sc.nextInt();
		
		factorial=num;
		
		for(int i=num-1;i>0;i--) {
			factorial*=i;
			System.out.println(factorial);
		}
		
		System.out.println("El factorial de "+num+" es "+factorial);
		
		sc.close();
	}

}
