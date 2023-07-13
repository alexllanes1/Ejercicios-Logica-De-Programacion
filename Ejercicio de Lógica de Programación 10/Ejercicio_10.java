package Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		HashMap<String, String> englishToSpanish = new HashMap<>();
		
		englishToSpanish.put("Hola", "Hello");
		englishToSpanish.put("Mujeres", "Women");
		englishToSpanish.put("Craneo", "Skull");
		englishToSpanish.put("Mapas", "Maps");
		englishToSpanish.put("Telefono", "Telephone");
		englishToSpanish.put("Ver", "Watch");
		englishToSpanish.put("Refresco", "Soda");
		englishToSpanish.put("Frio", "Cold");
		englishToSpanish.put("Cinturon", "Belt");
		englishToSpanish.put("Pareja", "Couple");
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

		int i=0, correcto=0, incorrecto=0;
		
		while(i<5) {
			List<String> valuesList = new ArrayList<String>(englishToSpanish.keySet());
			int randomIndex = new Random().nextInt(valuesList.size());
			String randomValue = valuesList.get(randomIndex);
					
			Scanner palabra = new Scanner(System.in);
			System.out.println("Ingresar la traducción de la palabra " + randomValue + ": ");
			String word = palabra.nextLine();
			
			System.out.println(word);
			
			if(englishToSpanish.containsValue(word)) {
				System.out.println("La respuesta es correcta");
				correcto++;
				
			}
			else {
				System.out.println("La respuesta es incorrecta");
				incorrecto++;
			}
			i++;
		}
		
		System.out.println("Tuviste " + correcto + " respuestas correctas y " + incorrecto + " respuestas incorrectas");

		
	}
}
