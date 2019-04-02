package es.fpdual.primero.figuras;

public class Punto extends Object {

	private int coordenadaX;
	private int coordenadaY;
	
	public Punto(int coordenadaX, int coordenadaY) {
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Punto) {
			final Punto punto = (Punto) obj;
			return punto.getCoordenadaX()==this.coordenadaX
					&& punto.getCoordenadaY() == this.coordenadaY;
		}
		
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return this.coordenadaX + this.coordenadaY;
	}
	
	@Override
	public String toString(){
		return "(Coordenada X: " + this.coordenadaX +
			   ", Coordenada Y: " + this.coordenadaY + ")";
	}
}
