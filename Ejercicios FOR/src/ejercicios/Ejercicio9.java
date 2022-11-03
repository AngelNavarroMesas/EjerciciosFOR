package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num,div,primo=0;
		
		System.out.println("Introduzca un numero para averiguar si es primo");
		num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			div=num%i;
			
			if(div==0) {
				primo++;
			}
			
		}
		
		if(primo==2) {
			System.out.println("El numero "+num+" es un numero primo");
		}else {
			System.out.println("El numero "+num+" no es un numero primo");
		}
		
		
		sc.close();
	}

}
