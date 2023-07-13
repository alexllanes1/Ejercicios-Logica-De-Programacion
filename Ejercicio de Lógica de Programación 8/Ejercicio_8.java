package Ejercicios;

import java.util.Scanner;

public class Ejercicio_8 {

public static void main(String[] args) {
	int valor;
	int[] lista = new int [10];
	int[] lista2 = new int [10];
	int posicion = 0;
   	
	Scanner numero = new Scanner(System.in);
	
	for(int i = 0; i < 10; i++) {
		
		System.out.print("Ingrese un número: ");
		valor = numero.nextInt();
		lista[i] = valor;
	}
	
	numero.close();

	for(int i = 0; i < 10; i++){
		
		valor = lista[i];
		
		if(Ejercicio_8.isPrime(valor)) {
			lista2[posicion] = valor;
			posicion++;
		}
		
	}
	
	for(int i = 0; i < 10; i++){
		
		valor = lista[i];
		
		if(!Ejercicio_8.isPrime(valor)) {
			lista2[posicion] = valor;
			posicion++;
		}
		
	}
	
	for(int num: lista2) {
		System.out.println(num);
	}
    
}


static boolean isPrime(int n)
{
    if (n <= 1)
        return false;
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;
    return true;
}

}
