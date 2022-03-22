package aaParchis;

public class Color {
	



	private final int CASILLALIMITE;
	
	private String Color;
	


	public Color(int cASILLALIMITE, String color) {
		super();
		CASILLALIMITE = cASILLALIMITE;
		Color = color;
	}






	protected String getColor() {
		return Color;
	}

	protected void setColor(String color) {
		Color = color;
	}

	protected int getCASILLALIMITE() {
		return CASILLALIMITE;
	}


}
