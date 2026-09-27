package factorial;

public class Factorial {

	
	public static int factorial(int n) {

		// Caso base
		if (n == 0) {
			return 1;
	        }

		// Llamada recursiva
		return n * factorial(n - 1);
	    }

	public static void main(String[] args) {

		int numero = 5;
		System.out.println("El factorial es: " + factorial(numero));
	    }
	
}


