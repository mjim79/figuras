package es.fpdual.primero.figuras;

public class Circulo extends FiguraGeometrica 
					 {
	
	private int radio;
	
	public Circulo(Punto punto, int radio) {
		this.setPunto(punto);
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Circulo) {
			final Circulo circulo = (Circulo)obj;
			return circulo.getPunto().equals(this.getPunto()) 
					&& circulo.getRadio() == this.radio;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.radio + this.getPunto().hashCode();
	}

	@Override
	public double calcularArea() {
		
		return Math.PI * (this.radio * this.radio);
	}

	

}
