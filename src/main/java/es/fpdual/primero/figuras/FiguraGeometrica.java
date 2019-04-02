package es.fpdual.primero.figuras;

public abstract class FiguraGeometrica implements Movible{
	
	private Punto punto;
	
	public abstract double calcularArea();
	
	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof FiguraGeometrica) {
			final FiguraGeometrica figuraGeometrica = (FiguraGeometrica)obj;
			return figuraGeometrica.getPunto().equals(this.punto);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.punto.hashCode();
	}
	
public FiguraGeometrica mover(Punto puntoDestino) {
		
		if (puntoDestino.getCoordenadaX() <0 ||
				puntoDestino.getCoordenadaY() <0) {
			throw new 
			IllegalArgumentException
			("Coordenadas destino inválidas");
		}
		
		this.setPunto(puntoDestino);
		System.out.println("Moviendo figura al destino " 
					+ puntoDestino.toString());
		return this; 
	}

}
