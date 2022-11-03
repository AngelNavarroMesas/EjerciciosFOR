package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sus=0;
		double cali;
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduzca las calificaciones");
			cali = sc.nextDouble();
			
			if(cali<5) {
				sus++;
			}
			
		}
		
		if(sus==0) {
			System.out.println("No ha suspendido nadie");
		}else {
			System.out.println("Han suspendido "+sus+" alumnos");
		}
		sc.close();
	}

}
