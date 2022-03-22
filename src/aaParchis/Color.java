package aaParchis;

public class Color {
	



	private int casillaLimite;
	
	private String color;
	


	public Color(int casillaLimite, String color) {
		super();
		casillaLimite = casillaLimite;
		color = color;
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