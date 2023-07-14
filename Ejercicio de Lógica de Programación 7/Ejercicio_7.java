package Ejercicios;
import java.util.Scanner;

public class Ejercicio_7 {


	public static void main(String[] args) {
		System.out.println("¿Cuanto tiempo falta para el fin de semana?");
		System.out.println("Ingrese un día de la semana");
		Scanner dia = new Scanner (System.in);
		String valor = dia.nextLine ();
		String diaMin = valor.toLowerCase();
		
		System.out.println("Ingrese una hora (0-23)");
		int hour = dia.nextInt();
		
		System.out.println("Ingrese los minutos");
		int min = dia.nextInt();
		
		dia.close();
		
		if(hour>23) {
			System.out.println("La hora es incorrecta, ingrese un valor entre 0 y 23");
		} else if(min>59) {
			System.out.println("Los minutos son incorrectos, ingrese un valor entre 0 y 59");
		} else {
			switch(diaMin) {
			case "lunes":
				int min1=6660-(hour*60)-min;
				System.out.println("Faltan "+ min1+ " minutos para el fin de semana");
				break;
			case "martes":
				int min2=5220-(hour*60)-min;
				System.out.println("Faltan "+ min2+ " minutos para el fin de semana");
				break;
			case "miercoles":
				int min3=3780-(hour*60)-min;
				System.out.println("Faltan "+ min3+ " minutos para el fin de semana");
				break;
			case "jueves":
				int min4=2340-(hour*60)-min;
				System.out.println("Faltan "+ min4+ " minutos para el fin de semana");
				break;
			case "viernes":
				int min5=900-(hour*60)-min;
				if(min5<=0) {
					System.out.println("Ya es fin de semana");
				}else {
					System.out.println("Faltan "+ min5+ " minutos para el fin de semana");
				}
				break;
			case "sabado":
				System.out.println("Ya es fin de semana");
				break;	
			case "domingo":
				System.out.println("Ya es fin de semana");
				break;	
			default:
				System.out.println("Día inválido, proporciona un dia de lunes a viernes");
				break;
			}
			
		}
		

	}

}