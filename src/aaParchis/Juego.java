package aaParchis;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {

		
		Jugador max = new Jugador(34, "Rojo", "Max", 39, false);
		Scanner sr = new Scanner(System.in);
		int opc =0;
		while (opc != 3) {
			System.out.println("------MENU-----");
			System.out.println("----1-TirarDado---");
			System.out.println("----2-Donde Estoy---");
			System.out.println("----3-SALIR----");
			 opc = sr.nextInt();
			switch (opc) {
			case 1:{
				
				max.tirarDado();
		
				break;
			}
			case 2:{

				System.out.println(max.getPosicion());

			}

		}

	}
	}

}
