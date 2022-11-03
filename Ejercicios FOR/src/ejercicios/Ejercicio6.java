package ejercicios;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int imp, suma=0,cont=1;
		
		System.out.println("Estos son los 10 primeros numeros impares");
		
		for(int i=0;i<10;i++) {
			
			System.out.println(cont);
			
			suma+=cont;
			
			cont = cont+2;
			
		}
		
		System.out.println("La suma de los 10 primeros numeros impares es "+suma);
		
	}

}
