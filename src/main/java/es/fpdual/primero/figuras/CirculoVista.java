package es.fpdual.primero.figuras;

public class CirculoVista implements Pintable {
	
	public void pintar(FiguraGeometrica figuraGeometrica) {
		final Circulo circulo = (Circulo) figuraGeometrica;
		System.out.println(circulo.getPunto().toString() +
				" - Radio: " + circulo.getRadio());
		
	}



}
