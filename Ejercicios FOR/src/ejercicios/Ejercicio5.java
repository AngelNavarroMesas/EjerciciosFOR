package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, total=0, cont=0;
		
		for(int i=0; i<10; i++) {
			
			System.out.println("Introduzca otro numero para mostrar la media");
			num = sc.nextInt();
			
			total+=num;
			cont++;
			
		}
		
		total=total/cont;
		
		System.out.println("La media de los numeros introducidos es "+total);
		
		sc.close();
		
	}

}
