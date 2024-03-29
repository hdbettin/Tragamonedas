package Tragaperras;
import java.util.*;

public class Programa {

	public static void main(String[] args) {
		// 1. Declara y construye dos premios
        Fruta[] combinacion1 = {Fruta.FRESA, Fruta.FRESA, Fruta.FRESA};
		Premio premio1 = new Premio(combinacion1, 20);
		Fruta[] combinacion2 = {Fruta.SANDIA, Fruta.FRESA,Fruta.SANDIA};
		Premio premio2 = new Premio(combinacion2, 10);
		/* 2. Crea una m�quina con un tama�o de combinaci�n de 3 frutas,
		* un precio por partida de 0,5 euros
		* y los dos premios declarados previamente
		*/
		Maquina maquina = new Maquina(3, 0.5, premio1, premio2);
		/* 3. Solicita al usuario que introduzca por teclado la cantidad
		* de credito para jugar.
		*/
		System.out.println("Introduzca el cr�dito: ");
		Scanner teclado = new Scanner(System.in);
		double credito = teclado.nextDouble();
		teclado.nextLine();
		maquina.incrementarCredito(credito);
		// 4. Jugamos mientras haya credito disponible
		while (maquina.getCredito() > 0){
		//4.1 Realiza la jugada
		Fruta[] combinacion = maquina.jugar();
		//4.2 Muestra la combinaci�n obtenida y el cr�dito
		System.out.println(Arrays.toString(combinacion)
		+ " --- " + "lo siento perdiste. tu nuevo credito es: " + maquina.getCredito());
		//4.3 Pide al usuario que pulse intro para continuar
		System.out.println("Pulse Intro para volver a jugar");
		teclado.nextLine();
		}
		}
	}