package es.fpdual.primero.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void deberiaMoverElCirculo() {
		
		final Punto punto = new Punto(2, 2);
		final Circulo circulo = new Circulo(punto , 5);
		final Punto puntoDestino = new Punto(4, 4);
		
		final FiguraGeometrica resultado = circulo.mover(puntoDestino);
		
		assertTrue(resultado instanceof Circulo);
		assertEquals(puntoDestino, resultado.getPunto());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void deberiaLanzarExcepcionSiCoordenadasNegativasAlMover() {
		
		final Punto punto = new Punto(2, 2);
		final Circulo circulo = new Circulo(punto , 5);
		final Punto puntoDestino = new Punto(4, -1);
		
		circulo.mover(puntoDestino);
		
		
	}
	
	@Test
	public void deberiaDevolverTrueSiSonIguales () {
		final Punto punto1 = new Punto(2, 2);
		final Circulo circulo1 = new Circulo(punto1 , 5);
		final Punto punto2 = new Punto(2, 2);
		final Circulo circulo2 = new Circulo(punto2 , 5);
		
		final boolean resultado = circulo1.equals(circulo2);
		
		assertTrue(resultado);
	}
	
	@Test
	public void deberiaCalcularHashCode() {
		
		final Punto punto = new Punto(2, 2);
		final Circulo circulo = new Circulo(punto , 5);
		
		final int resultado = circulo.hashCode();
		
		assertEquals(9, resultado);
	}

}
