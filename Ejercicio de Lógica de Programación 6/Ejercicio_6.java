package Ejercicios;

import java.util.Scanner;

public class Ejercicio_6 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	    System.out.println("Ingresa una frase");
	    String Frase = input.nextLine();

	       System.out.println("String original: "+Frase);

	       StringBuilder reverseString = new StringBuilder();
	       reverseString.append(Frase);


	       reverseString.reverse();

	       String result = reverseString.toString();


	       System.out.println("Reverso: "+result);
		   input.close();

}
	}
