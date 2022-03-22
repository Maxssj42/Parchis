package aaParchis;

import java.util.Iterator;

public class Jugador {
	private int casillaLimite;

	private String color;
	private String nombre;
	private int posicion;
	private boolean v = false;

	public Jugador(int casillaLimite, String color, String nombre, int posicion, boolean v) {
		this.casillaLimite = casillaLimite;
		this.color = color;
		this.nombre = nombre;
		this.posicion = posicion;
		this.v = v;
	}

	public void tirarDado() {
		System.out.println("Estas en la posicion " + getPosicion());

		System.out.println("Se tiran los dados");

		int dado1 = (int) (Math.random() * (6 - 0) + 1);
		System.out.println("En el dado 1 ha salido: " + dado1);
		int dado2 = (int) (Math.random() * (6 - 0) + 1);
		System.out.println("En el dado 2 ha salido: " + dado2);
		for (int i = 0; i < dado1 + dado2; i++) {
			if (getPosicion() + dado1 + dado2 > 68) {
				setPosicion(getPosicion() + dado1 + dado2 - 68);
				i = dado1 + dado2;
			}
			setPosicion(getPosicion() + 1);
			if (getPosicion() == getCasillaLimite()) {
				System.out.println("estas en tu zona");
				setCasillaLimite(8);
				setPosicion(0);
				i = dado1 + dado2;
			}
			
		}

		if (getPosicion() == 0) {
			System.out.println("Se tiran los dados");
			dado1 = (int) (Math.random() * (6 - 0) + 1);
			System.out.println("En el dado 1 ha salido: " + dado1);
			dado2 = (int) (Math.random() * (6 - 0) + 1);
			System.out.println("En el dado 2 ha salido: " + dado2);
			if (dado1 + dado2 == 8) {
				v= true;

			}

		}
		
		System.out.println("Ahora estas en la posicion " + getPosicion());
		if (v) {
			System.out.println("Enhorabuena " +getNombre() + " has ganado");
		}
		
	}
	

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getPosicion() {
		return posicion;
	}

	protected void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	protected int getCasillaLimite() {
		return casillaLimite;
	}

	protected void setCasillaLimite(int casillaLimite) {
		this.casillaLimite = casillaLimite;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
