package Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> englishToSpanish = new HashMap<>();
		
		englishToSpanish.put("Hola", "Hello");
		englishToSpanish.put("Mujeres", "Women");
		englishToSpanish.put("Craneo", "Skull");
		englishToSpanish.put("Mapas", "Map");
		englishToSpanish.put("Telefono", "Telephone");
		englishToSpanish.put("Ver", "Watch");
		englishToSpanish.put("Refresco", "Soda");
		englishToSpanish.put("Frio", "Cold");
		englishToSpanish.put("Cinturon", "Belt");
		englishToSpanish.put("Pareja", "Partner");
		englishToSpanish.put("Hora", "Hour");
		englishToSpanish.put("Entrada", "Entrance");
		englishToSpanish.put("Fuego", "Fire");
		englishToSpanish.put("Hielo", "Ice");
		englishToSpanish.put("Dragon", "Dragon");
		englishToSpanish.put("Interruptor", "Switch");
		englishToSpanish.put("Profundo", "Deep");
		englishToSpanish.put("Debil", "Weak");
		englishToSpanish.put("Pista", "Clue");
		englishToSpanish.put("Grupo", "Group");

		Scanner palabra = new Scanner(System.in);
		System.out.println("Ingresar una palabra que quieras traducir al Inglés: ");
		String word = palabra.nextLine();
		palabra.close();
		
		if(englishToSpanish.containsKey(word)) {
			System.out.println(word + " en inglés es: " + englishToSpanish.get(word));
		}
		else {
			System.out.println("La palabra no se encuentra en el diccionario.");
		}
		
	}

}
